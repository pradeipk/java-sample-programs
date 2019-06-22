package com.p2.finals;


/**
 * 
 * @author pradeep_patel
 * Demonstrate Final variable, final method and final class
 */

class Final {

	final Integer fInt = 23;
	public final void makeSound() {
		FinalEx finalex = new FinalEx();
		// The final field FinalEx.fInt cannot be assigned
		finalex.fInt = 34;		
	}
}

final class FinalEx extends Final{
	final Integer fInt = 23;
// Cannot override the final method from Final
	public  void makeSound() {
		System.out.println("Make Sound:");
	}	
}

//Remove final Modifer for finalEx class
//Compilation error when extending the final class 
public class ChildOfFinal extends FinalEx {

}
