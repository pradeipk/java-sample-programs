package com.pradeip.poc.corejava.designpatterns;


/**
Eager Initailization
object is created at the time of class loading.
May lead to resource wastage. Because instance of class is created always, whether it is required or not.
CPU time is also wasted in creation of instance if it is not required.
Exception handling is not possible.
*/
class SingletonWithEagerInitialization {

	// Java code to create singleton class by
	// Eager Initialization

	// public instance initialized when loading the class
	public static SingletonWithEagerInitialization instance = new SingletonWithEagerInitialization();

	private SingletonWithEagerInitialization() {
		System.out.println("In line 12 ----------------- >");
	}

}

public class MainSingletonEx {

	public static void main(String[] args) {

		// constructor is called only once hence a single instance is available. 
		SingletonWithEagerInitialization instance0 = SingletonWithEagerInitialization.instance;
		SingletonWithEagerInitialization instance1 = SingletonWithEagerInitialization.instance;

	}

}
