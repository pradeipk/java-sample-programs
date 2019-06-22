package com.pradeip.poc.corejava.collections;


//Java program to demonstrate ListIterator
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		for (int i = 0; i < 10; i++)
			al.add(i);
		System.out.println(al);

		// at beginning ltr(cursor) will point to
		// index just before the first element in al
		ListIterator ltr = al.listIterator();
		
		al.forEach (e -> System.out.println(e + "------18") );

		// checking the next element availabilty
		while (ltr.hasNext()) {
			// moving cursor to next element
			int i = (Integer) ltr.next();

			// getting even elements one by one
			System.out.print(i + " ");

			// Changing even numbers to odd and
			// adding modified number again in
			// iterator
			if (i % 2 == 0) {
				i++; // Change to odd
				ltr.set(i); // set method to change value
				ltr.add(i); // to add
			}
		}
		System.out.println();
		System.out.println(al);
	}
}
