package com.pradeip.poc.corejava.enums;

//A simple enum example where enum is declared
//outside any class (Note enum keyword instead of
//class keyword)
enum Color {
	RED, GREEN, BLUE;
}

public class EnumEx {
	// Driver method
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println(c1.toString());
		System.out.println(c1);
		// values method 
		Color arr[] = Color.values();
		// enum with loop
		for (Color col : arr) {
			// Calling ordinal() to find index
			// of color.
			System.out.println(col + " at index " + col.ordinal());
		}
	}
}
