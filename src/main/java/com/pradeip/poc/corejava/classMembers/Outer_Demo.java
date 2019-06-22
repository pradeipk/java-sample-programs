package com.pradeip.poc.corejava.classMembers;


class Outer_Demo {
	// private variable of the outer class
	private int num = 175;

	// inner global class
	public class Inner_Demo {
		public int getNum() {
			System.out.println("This is the getnum method of the inner class");
			return num;
		}
	}

	// static inner global class
	static class Nested_Demo {
		public void my_method() {
			System.out.println("This is my nested class");
		}
	}

	void my_Method() {
		final int num = 23;
		// method-local inner class

		class MethodInner_Demo {
			public void print() {
				System.out.println("This is method inner class " + num);
			}
		} // end of inner class
			// Accessing the inner class
		MethodInner_Demo inner = new MethodInner_Demo();
		inner.print();
	}

}
