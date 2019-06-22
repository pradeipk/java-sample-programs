package com.pradeip.poc.corejava.designpatterns;


/**
 * Java Code to create singleton class With Lazy initialization, Only when you call
 * getInstance the object is created , instance is created on demand and not by default.
 * @author pradeep_patel
 *
 */
class LazySingleton {
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static LazySingleton instance;

	private LazySingleton() {
		System.out.println("Creating Singleton Instance --------------------- >");
	}

	/**
	 *  method to return instance of class
	 * @return LazySingleton;
	 */
	public static LazySingleton getInstance() {
		// if instance is null, initialize
		if (instance == null) {			
			instance = new LazySingleton();
		}
		return instance;
	}
	
	
	/**
	 * Overcome Cloning issue:- To overcome this issue, override clone() method and throw an exception 
	 * from clone method that is CloneNotSupportedException. Now whenever user will try to create 
	 * clone of singleton object, it will throw exception and hence our class remains singleton.
	 * 
	 * Another way is to return the same instance 
	 */
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// throw new CloneNotSupportedException();
		return getInstance();
	}
}

public class SingleTonWithLazyInitialization {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LazySingleton singleton = LazySingleton.getInstance();
	}
}

/*
Pros:

    Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
    Exception handling is also possible in method.

Cons:
    Every time a condition of null has to be checked.
    instance can’t be accessed directly.
    In multithreaded environment, it may break singleton property.
*/