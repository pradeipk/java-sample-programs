package com.pradeip.poc.corejava.utility;


/*
 * @Author Pradeep
 * */

public class FactorialusingRecursion {

	public static void main(String args[]) {
		System.out.println(factorial(1));
	}

	public static long factorial(long f) {
		if (f != 1) {
			return f * factorial(f - 1);
		} else {
			return f;
		}
	}
}
