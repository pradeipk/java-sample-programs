package com.pradeip.poc.corejava.designpatterns;


import java.io.Serializable;

/**
 * A thread safe singleton is created so that singleton property is maintained
 * even in multithreaded environment. To make a singleton class thread-safe,
 * getInstance() method is made synchronized so that multiple threads can’t
 * access it simultaneously.
 * 
 * @author pradeep_patel
 *
 */
class ThreadSafeSingletonClass implements Serializable{

	private static ThreadSafeSingletonClass instance;
	private ThreadSafeSingletonClass() {
		System.out.println("I am in constructor --------------- > ");
	}

	synchronized  public  static ThreadSafeSingletonClass getInstance() {
		if (instance == null) {
			return new ThreadSafeSingletonClass();
		} else {
			return instance;
		}
	}
	
}

public class ThreadSafeSingleton {
	public static void main(String[] args) {
		ThreadSafeSingletonClass instance = ThreadSafeSingletonClass.getInstance();
	}
}

/*
 * Pros: Lazy initialization is possible. It is also thread safe. 
 * 
 * Cons:
 * getInstance() method is synchronized so it causes slow performance as
 * multiple threads can’t access it simultaneously.
 */
