package com.p2.enums;

//enum declaration inside a class.
public class EnumExInsideClass {
	enum Color {
		RED, GREEN, BLUE;
	}

	public static void main(String[] args) {
		Color c1 = Color.RED;
		Color c2 = Color.valueOf("GREEN");
		System.out.println(c1);
	}
}
