package com.pradeip.poc.corejava.inheritance;

public class Main {

	public static void main(String args[]) {

		Animal a = new Animal(); // Animal reference and object
		Animal b = (Animal)new Dog(); // Animal reference but Dog object vice versa will not work
		//Dog d = (Dog) new Animal(); // java.lang.ClassCastException:
		// Dog d = new Animal(); this will give casting error
		a.move(); // runs the method in Animal class
		b.move(); // runs the method in Dog class
		// b.bark(); this will give an error
		((Dog) b).bark();

		// -----------------------

		Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
		Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();
		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();

	}

}
