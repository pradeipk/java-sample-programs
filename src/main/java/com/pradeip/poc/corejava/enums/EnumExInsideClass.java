package com.pradeip.poc.corejava.enums;

//enum declaration inside a class.
public class EnumExInsideClass {
	// An enum (Note enum keyword instead of class keyword)
	enum Color {
		RED, GREEN, BLUE;
	}

	public static void main(String[] args) {
		Color c1 = Color.RED;
		Color c2 = Color.valueOf("GREEN");
		System.out.println(c1);
	}
}
