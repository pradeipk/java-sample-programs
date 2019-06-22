package com.p2.designpatterns;


/**class is created when it is loaded to the memory by JVM. It is done by assigning the reference an instance directly.
It can be used when program will always use instance of this class, or the cost of creating the instance is not too 
large in terms of resources and time.
 * 
 * @author pradeep_patel
 *
 */

class Singleton {

	private Singleton() {
		System.out.println("Creating Singleton Instance --------------------- >");
	};

	public static Singleton instance;
	 static {
		instance = new Singleton();
	}

	public void printMe() {
		System.out.println("I am in printMe Method --------------------------- >");
	}

}

public class SigletonUsingStaticBlock {

	public static void main(String[] args) {
		Singleton singleton = Singleton.instance;
		singleton.printMe();

	}

}
