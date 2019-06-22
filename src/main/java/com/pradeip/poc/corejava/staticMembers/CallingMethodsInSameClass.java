package com.pradeip.poc.corejava.staticMembers;


/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class CallingMethodsInSameClass {

	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
		// Cannot make a static reference to the non-static method printThree()
		// from the type CallingMethodsInSameClass
		// printThree();
		CallingMethodsInSameClass cmi = new CallingMethodsInSameClass();
		cmi.printThree();
		
		// below classes will be not available outside of the class definition
		cmi.printMeNonStatic();
		cmi.printMe();
		CallingMethodsInSameClass.printMe();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}

	// non static methods can be called only on object and not on class
	public void printThree() {
		System.out.println("Hello World 3");
		// printOne();
	}

	private static void printMe() {

		System.out.println("printMe ------------------ > 39");
	}

	private void printMeNonStatic() {
		System.out.println("printMeNonStatic ------------------ > 43");

	}

}