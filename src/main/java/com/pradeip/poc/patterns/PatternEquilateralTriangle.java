package com.pradeip.poc.patterns;

public class PatternEquilateralTriangle {

	public static void main(String[] args) {
		int noOfRows = 5; // Number of rows
		//printEquilateralTriangle(noOfRows);
		//printLeftTriangle(noOfRows);
		printRightAlignedTriangle(noOfRows);
	}

	public static void printEquilateralTriangle(int noOfRows) {
		// First loop goes from 1 to n for the number of rows
		for (int currentLine = 1; currentLine <= noOfRows; currentLine++) {
			// No of spaces = noOfRows - line number
			for (int j = currentLine; j < noOfRows; j++) {
				System.out.print(" ");
			}
			// Print odd no of stars given by the formula 2*i-1 to print odd number of
			// stars.
			for (int k = 1; k <= (2 * currentLine - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line
			System.out.println();
		}
	}

	public static void printLeftTriangle(int noOfRows) {
		// First loop goes from 1 to n for the number of rows
		for (int currentLine = 1; currentLine <= noOfRows; currentLine++) {

			// Print odd no of stars given by the formula 2*i-1 to print odd number of
			// stars.
			for (int k = 1; k <= (2 * currentLine - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line
			System.out.println();
		}
	}

	public static void printRightAlignedTriangle(int noOfRows) {
		// First loop goes from 1 to n for the number of rows
		for (int currentLine = 1; currentLine <= noOfRows; currentLine++) {
			// No of spaces = noOfRows - line number
			for (int j = 2* (noOfRows - currentLine); j >= 1; j--) {
				System.out.print(" ");
			}
			// Print odd no of stars given by the formula 2*i-1 to print odd number of
			// stars.
			for (int k = 1; k <= (2 * currentLine - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line
			System.out.println();
		}
	}
}
