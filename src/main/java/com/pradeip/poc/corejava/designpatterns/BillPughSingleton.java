package com.pradeip.poc.corejava.designpatterns;


//Java code for Bill Pugh Singleton Implementaion;
class SingletonClass {

	private SingletonClass() {
		System.out.println("I am inside constructor ----------------------- > ");
	}

	// Inner class to provide instance of class
	private static class BillPughSingleton {
		private static final SingletonClass INSTANCE = new SingletonClass();
	}

	public static SingletonClass getInstance() {
		return BillPughSingleton.INSTANCE;
	}
}

public class BillPughSingleton {
	public static void main(String[] args) {
		SingletonClass singleton = SingletonClass.getInstance();
	}
}


/*When the singleton class is loaded, inner class is not loaded and hence doesn’t create object when loading the class. 
 * Inner class is created only when getInstance() method is called. So it may seem like eager initialization but 
 * it is lazy initialization. This is the most widely used approach as it doesn’t use synchronization.
 * 
 * */
