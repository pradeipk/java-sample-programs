package com.pradeip.poc.corejava.collections.generics;


import java.util.ArrayList;
import java.util.List;

/**
 * https://docs.oracle.com/javase/tutorial/java/generics/
 * @author pradeep_patel
 *
 */
public class GenericsEx {

	public static void main(String[] args) {

		// instance of Integer type
		Test<Integer> iObj = new Test<Integer>(15);
		System.out.println(iObj.getObject());

		// instance of String type
		Test<String> sObj = new Test<String>("GeeksForGeeks");
		System.out.println(sObj.getObject());
		// Calling generic method with Integer argument
		Test00.genericDisplay(11);

		// Calling generic method with String argument
		Test00.genericDisplay("GeeksForGeeks");

		// Calling generic method with double argument
		Test00.genericDisplay(1.0);
		
		ArrayList< Integer> al = new ArrayList<Integer>();
		al.add(89);
		Test000 tt = new Test000(al);
	}
}

// A Simple Java program to show working of user defined
// Generic classes
// We use < > to specify Parameter type

/**
 * To create an instance of generic class BaseType <Type> obj = new BaseType <Type>()
	Note: In Parameter type we can not use primitives like 'int','char' or 'double'.* 
 * 
 * @author pradeep_patel
 *
 * @param <T>
 */



class Test<T> {
	// An object of type T is declared
	T obj;

	Test(T obj) {
		this.obj = obj;
	} // constructor

	public T getObject() {
		return this.obj;
	}

	// We use < > to specify Parameter type
	class Testt<T, U> {
		T obj1; // An object of type T
		U obj2; // An object of type U

		// constructor
		Testt(T obj1, U obj2) {
			this.obj1 = obj1;
			this.obj2 = obj2;
		}
		// To print objects of T and U
		public void print() {
			System.out.println(obj1);
			System.out.println(obj2);
		}
	}
}

class Test000<List> {

	List l;

	Test000(List obj) {
		this.l = obj;
	}

	List getList() {
		return this.l;
	}
}

/**
 * 
 * @author pradeep_patel
 *Either mention generic <T> at class level or at method level as shown below
 */

class Test00 {
	// A Generic method example either <T> or any Letter like <G>
	public  <T> T genericPrint(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
		return element;
	}
	
	public static <T> void genericDisplay(T element){
		System.out.println(element.getClass().getName() + " = " + element);
	}
}

/** 
Advantages of Generics:

1. Programs that uses Generics has got many benefits over non-generic code.

2. Code Reuse: We can write a method/class/interface once and use for any type we want.

Type Safety : Generics make errors to appear compile time than at run time 
(It’s always better to know problems in your code at compile time rather than making your code fail at run time). 
Suppose you want to create an ArrayList that store name of students and if by mistake programmer adds an integer 
object instead of string, compiler allows it. But, when we retrieve this data from ArrayList, it causes problems at runtime.

* We generally use generics while writing AbstractDao
* 
* 
3. Individual Type Casting is not needed: If we do not use generics, then, in the above example every-time we 
	retrieve data from ArrayList, we have to typecast it. Typecasting at every retrieval operation is a big headache. 
	If we already know that our list only holds string data then we need not to typecast it every time. 
*/

class TestWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// Creatinga an ArrayList without any type specified
		List al = new ArrayList();

		al.add("Sachin");
		al.add("Rahul");
		al.add(10); // Compiler allows this

		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);

		// Causes Runtime Exception
		String s3 = (String) al.get(2);
	}
}

class TestWithGenerics {
	public static void main(String[] args) {
		// Creating a an ArrayList with String specified
		ArrayList<String> al = new ArrayList<String>();

		al.add("Sachin");
		al.add("Rahul");

		// Now Compiler doesn't allow this
		//al.add(10);

		String s1 = (String) al.get(0);
		String s2 = (String) al.get(1);
		String s3 = (String) al.get(2);
	}
}
