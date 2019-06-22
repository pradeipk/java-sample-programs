package com.pradeip.poc.corejava.staticMembers;


//filename: Main.java
// The public type StaticB must be defined in its own file
 class StaticB {
	static int i;
	int j;

	// start of static block
	static {
		i = 10;
		System.out.println("static block called ");
	}
	// end of static block
}
 
 

class Test {
	public static void main(String args[]) {
		// Although we don't have an object of Test, static block is
		// called because i is being accessed in following statement.
		System.out.println(StaticB.i);
	}
}