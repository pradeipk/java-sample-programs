package com.pradeip.poc.corejava.designpatterns;


//Java code to explain double check locking
class SingletonWithBlockSync {
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static SingletonWithBlockSync instance;

	private SingletonWithBlockSync() {
		// private constructor
	}

	public static SingletonWithBlockSync getInstance() {
		if (instance == null) {
			// synchronized block to remove overhead
			synchronized (SingletonWithBlockSync.class) {
				if (instance == null) {
					// if instance is null, initialize
					instance = new SingletonWithBlockSync();
				}
			}
		}
		return instance;
	}
}

public class ThreadSafeSingletonWithBlockSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
