package com.pradeip.poc.corejava.PassByValue;

//Q: How does Java pass arguments to methods ? (Pass by value or Pass by Reference)
public class PassByValueEx {

	public void badSwap(Integer var1, Integer var2) {
		int temp = var1;
		var1 = var2;
		var2 = temp;
		System.out.println("Values Inside badSwap after swapping : var1:" + var1 + " var2:" + var2);
	}

	public void tricky(Point arg1, Point arg2) {
		// reasign
		arg1.x = 100;
		arg1.y = 100;
		// swaping ...
		Point temp = arg1;

		arg1 = arg2;
		arg2 = temp;
	}

	public static void main(String[] args) {
		Integer var1 = 8;
		Integer var2 = 10;
		PassByValueEx er = new PassByValueEx();
		System.out.println("Before Swapping : var1:" + var1 + " var2:" + var2);
		er.badSwap(var1, var2);
		System.out.println("After Swapping :  var1 " + var1 + " var2:" + var2);

		Point pnt1 = new Point(0, 0);
		Point pnt2 = new Point(0, 0);
		System.out.println("X: " + pnt1.x + " Y: " + pnt1.y);
		System.out.println("X: " + pnt2.x + " Y: " + pnt2.y);
		System.out.println(" ");
		er.tricky(pnt1, pnt2);
		System.out.println("X: " + pnt1.x + " Y:" + pnt1.y);
		System.out.println("X: " + pnt2.x + " Y: " + pnt2.y);

		// reassign worked, but swapping failed
	}
}

// Point class to demonstrate the effect of passing objects
class Point {

	Integer x;
	Integer y;

	public Point(Integer x, Integer y) {
		super();
		this.x = x;
		this.y = y;
	}

}
