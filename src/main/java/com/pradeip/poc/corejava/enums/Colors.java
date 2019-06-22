package com.p2.enums;

//A Java program to demonstrate that we can have
//main() inside enum class.
public enum Colors {
	RED, GREEN, BLUE;
	// Driver method
	public static void main(String[] args) {
		Colors c1 = Colors.RED;
		System.out.println(c1);
	}
}
