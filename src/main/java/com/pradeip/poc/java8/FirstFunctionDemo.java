package com.pradeip.poc.java8;

import java.util.function.Function;

public class FirstFunctionDemo {

	public static void main(String[] args) {

		// 1. Assigning function to a variable
		Function<Integer, Integer> square = x -> x * x;
		System.out.println("Square of 5: " + square.apply(5)); // Output: 25

		// 2. Passing function as an argument
		int result = applyFunction(10, x -> x + 100);
		System.out.println("Result after applying function: " + result); // Output: 110

		// 3. Returning a function from a method
		Function<Integer, Integer> doubler = getMultiplierFunction(2);
		System.out.println("Doubled 8: " + doubler.apply(8)); // Output: 16
	}

	// Function that accepts another function
	public static int applyFunction(int value, Function<Integer, Integer> func) {
		return func.apply(value);
	}

	// Function that returns another function
	public static Function<Integer, Integer> getMultiplierFunction(int multiplier) {
		return x -> x * multiplier;
	}
}
