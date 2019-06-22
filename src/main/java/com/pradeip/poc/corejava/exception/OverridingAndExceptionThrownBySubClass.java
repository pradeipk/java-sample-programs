package com.p2.exception;

import java.sql.BatchUpdateException;
import java.sql.SQLException;


/**
 * 
 * @author pradeep_patel
 *
 *This sample of code demonstrates exception and overriding concept put together
 */

public class OverridingAndExceptionThrownBySubClass {

	public static void main(String[] args) {		

	}

}

/** Case - 01
 * 
 * @author pradeep_patel
 * 
 * If super class method is not throwing any exceptions, then it can be overrided with any 
 * unchecked type of exceptions, but can not be overrided with checked type of exceptions.
 * 
 *
 */

class SuperClass {
	// Case -01
	void methodOfSuperClass() {
		System.out.println("Super class method is not throwing any exceptions");
	}
	
	// case -02
	void methodOfSuperClassThrowingRuntimeException() throws ArrayIndexOutOfBoundsException {
        System.out.println("Super class method is throwing Unchecked exception");
    }
	
	// case -03
	void methodOfSuperClassThrowingCheckedException() throws SQLException {
		System.out.println("Super class method is throwing Unchecked exception");
	}
}

class SubClass extends SuperClass {
	
	/** Case -01
	 *  Overriden method can throw unchecked exception even when parent method is not throwing any exception
	 */
	@Override
	void methodOfSuperClass() throws ArrayIndexOutOfBoundsException {
		System.out.println("can be overrided with any unchecked Exception");
	}
	
	
	/**
	 * Case -02 Overriden method can throw other runtime exceptions 
	 */
	@Override
	void methodOfSuperClassThrowingRuntimeException() throws NumberFormatException, NullPointerException, RuntimeException {
		System.out.println("Super class method is throwing Unchecked exception");
	}
	
	/**
	 * Case -03 Overriden method can throw the same or subtype of checked exception + any runtime Exception 
	 */
	@Override
	void methodOfSuperClassThrowingCheckedException() throws SQLException, NullPointerException {
		System.out.println("Super class method is throwing Unchecked exception");
	}
	
}

class SubClassOne extends SuperClass {
	/**
	 * Case -03 Overriden method can throw the same or subtype of checked exception + any runtime Exception 
	 * 
	 * Exception ClassNotFoundException is not compatible with throws clause.
	 */
	@Override
	void methodOfSuperClassThrowingCheckedException() throws ClassNotFoundException, NullPointerException {
		System.out.println("Super class method is throwing Unchecked exception");
	}	
}

class SubClassTwo extends SuperClass {
	
	/**
	 * Overriden method should not throw any checked exception until parent is throwing.
	 */	
	@Override
	void methodOfSuperClass() throws SQLException {
		// Compile time error
		// Can not be overrided with checked exception
	}
	
	/**
	 *  case -03 
	 *  Here method is throwing checked exception of sub-type
	 */
	void methodOfSuperClassThrowingCheckedException()
			throws BatchUpdateException {
		System.out.println("Super class method is throwing Unchecked exception");
	}	
}


/**
 * Case -02
 * If a super class method is throwing unchecked exception, then it can be overrided in the sub class with same
 * exception or any other unchecked exceptions but can not be overrided with checked exceptions.
 * 
 */


/**
 * Overriding methods can throw any runtime exception there is no constraint
 * 
 * Overriding methods can only throw same or subtype exception when method in parent class is throwing checked exception
 */


