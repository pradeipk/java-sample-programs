package com.pradeip.poc.corejava.staticMembers;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StaticEx staticEx  = new StaticEx();
		StaticEx.age = 37;
		staticEx.age = 49;
		StaticEx staticEx2  = new StaticEx();
		System.out.println(staticEx2.age);
		
		CallingMethodsInSameClass ex = new CallingMethodsInSameClass();

	}

}
