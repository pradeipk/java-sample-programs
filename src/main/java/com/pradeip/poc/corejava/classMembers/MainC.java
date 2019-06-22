package com.pradeip.poc.corejava.classMembers;


public class MainC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Instantiating the outer class
		Outer_Demo outer = new Outer_Demo();
		// Instantiating the inner class
		Outer_Demo.Inner_Demo inner = outer.new Inner_Demo();
		System.out.println(inner.getNum());

		Outer_Demo demo_2 = new Outer_Demo();
		demo_2.my_Method();

		Outer_Demo.Nested_Demo nested = new Outer_Demo.Nested_Demo();
		// my_method() is a instance variable 
		nested.my_method();

	}
}
