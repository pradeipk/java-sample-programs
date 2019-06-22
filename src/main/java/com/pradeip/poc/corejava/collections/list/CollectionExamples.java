package com.pradeip.poc.corejava.collections.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CollectionExamples {

	public static void main(String[] args) {
		VectorEx.iterateVector();
	}
}

/**
 * http://javaconceptoftheday.com/differences-between-enumeration-vs-iterator-in-java/
 * @author pradeep_patel The Vector class provides the capability to implement a
 *         growable array of objects 
 *         Mind the difference between Vector and List
 *         When using List you will see only list interface methods See use of
 *         enumeration
 *         to use vector enumeration use reference of Vector type and not List type
 */
class VectorEx {

	static Integer ints[] = {1,2,3,4,6,9,5};
	static void iterateVector() {
		List<Integer> listVal = Arrays.asList(ints);
		// -----------------------------List with Vector as implementation
		// ----------------------
		List<Integer> vector = new Vector<Integer>();
		vector.addAll(listVal);
		vector.add(23);
		vector.add(45);

		for (Integer integer : vector) {
			System.out.println(integer);
		}

		System.out.println("Using Iterator --------->");
		Iterator<Integer> it = vector.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		List<Integer> list = new Vector<Integer>(vector);
		Iterator<Integer> its = list.iterator();
		System.out.println("Remove Example using iterator --------->");
		while (its.hasNext()) {	
			System.out.println(its.next());
			its.remove();			
			
		}	

		// -----------------------------using vector class
		// ----------------------
		Vector<Integer> tvsvector = new Vector<Integer>();
		tvsvector.addAll(vector);

		System.out.println("Using Enumeration --------->");
		Enumeration<Integer> en = tvsvector.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		System.out.println("Using for each in vector --------->");
		for (Integer integer : tvsvector) {
			System.out.println(integer);
		}
	}
}
