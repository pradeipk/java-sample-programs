package com.p2.enums;

//Java program to demonstrate that enums can have constructor
//and concrete methods.

//An enum (Note enum keyword inplace of class keyword)
enum Menu {
	RED, GREEN, BLUE;

	// enum constructor called separately for each
	// constant
	private Menu() {
		System.out.println("Constructor called for : " + this.toString());
	}
	// Only concrete (not abstract) methods allowed
	public void colorInfo() {
		System.out.println("Universal Color");
	}
}

public class EnumConstr {
	// Driver method
	public static void main(String[] args) {
		Menu c1 = Menu.RED;
		System.out.println(c1);
		c1.colorInfo();
	}
}
