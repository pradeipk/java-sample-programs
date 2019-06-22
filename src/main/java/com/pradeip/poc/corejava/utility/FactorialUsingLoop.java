package com.pradeip.poc.corejava.utility;


public class FactorialUsingLoop {

	public static void main(String[] args) {
		
		  Long z = (long) 1; int facto = 80;		  
		  for (int i = 1; i <= facto; i++) { z = z * i; //
		  //System.out.println(z);
		  
		  } System.out.println("Factorial of " + facto + ":" + z);
		 

		/*final int NUM_FACTS = 100;
		for (int i = 0; i < NUM_FACTS; i++)
			System.out.println(i + "! is " + factorial(i));*/
	}

	public static int factorial(int n) {
		int result = 1;
		for (int i = 2; i <= n; i++)
			result *= i;
		return result;
	}

}
