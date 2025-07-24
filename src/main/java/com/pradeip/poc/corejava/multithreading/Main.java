package com.pradeip.poc.corejava.multithreading;

public class Main {

	public static void multiThreadUsingRunnanbleInterface() {

		for (int i = 0; i < 8; i++) {
			MultithreadingRunnable object = new MultithreadingRunnable();
			new Thread(object).start();
		}
	}

	public static void multiThreadExByExtendingThread() {

		for (int i = 0; i < 8; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
		}
	}

	public static void main(String[] args) {
		int n = 8; // Number of threads
		multiThreadUsingRunnanbleInterface();
		multiThreadExByExtendingThread();
	}
}
