package com.pradeip.poc.corejava.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsClassExample {

	public static void main(String[] args) {

		try {
			UseOfCollections.addAll();
			UseOfCollections.max();
		} catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}
	}
}

class UseOfCollections {

	static Integer[] intArray = { 78, 45, 23, 69, 85, 21, 47, 86 };
	static List<Integer> l0, l1, l2, l3;

	static void addAll() {
		try {
			l0 = (List<Integer>) Arrays.asList(intArray);
			// Addition of new element will throw class
			// java.lang.UnsupportedOperationException
			Collections.addAll(l0, 78, 12);

		} catch (Exception e) {
			print(e, "Add All");
			l1 = new ArrayList<Integer>();
			Collections.copy(l1, l0);
			print(l1, "Copy");
		}
	}

	static void copy() {

		try {

		} catch (Exception e) {

		}
	}

	static void max() {
		l2 = (List<Integer>) Arrays.asList(intArray);
		print(Collections.max(l2), "Max");
	}

	static void synchronizationInCollection() {

		l3 = (List<Integer>) Arrays.asList(intArray);
		List<Integer> cwa = new CopyOnWriteArrayList<Integer>();

		Collections.synchronizedCollection(l3);
		Collections.frequency(l3, 4);

	}

	static <T> void print(T obj, String methodName) {
		System.out.println("Method Name: " + methodName);
		if (obj instanceof List) {
			List<T> ll = (List) obj;
			for (T integer : ll) {
				System.out.println(integer);
			}
		} else {
			System.out.println(obj);
		}
	}
}