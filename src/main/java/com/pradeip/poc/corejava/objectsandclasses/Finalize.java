package com.p2.objectsandclasses;

/**
 * To demonstrate the use finalize method
 * @author pradeep_patel
 *
 */
class TestFinalize {
	Integer int0 = 9;	
	// Override this method to release resource
	@Override
	protected void finalize() {
		System.out.println("finalize method called");
	}
}

public class Finalize {

	public static void main(String[] args) {
		TestFinalize tf = new TestFinalize();
		tf = null;
		System.gc();
		System.out.println("end ------------ >");

	}

}
