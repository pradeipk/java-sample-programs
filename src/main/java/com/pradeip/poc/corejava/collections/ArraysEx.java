package com.pradeip.poc.corejava.collections;


import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3 };
		int arr2[] = { 1, 2, 3 };
		// The constructor Arrays(int) is undefined that means its constructor
		// is private for non-instantiation
		// Arrays arrays = new Arrays();
		// arrays = {1,2,3,4,5,6};
		int a[] = new int[4];
		a[0] = 2;
		a[1] = 2;
		a[2] = 2;
		a[3] = 2;
		// gives array out of bound exception
		// a[4]=7;

		int b[] = new int[4];
		b[0] = 2;
		b[1] = 2;
		b[2] = 2;
		b[3] = 2;

		System.out.println(a[3]);
		// Arrays equality comparison
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(3 << 2);

	}

}









