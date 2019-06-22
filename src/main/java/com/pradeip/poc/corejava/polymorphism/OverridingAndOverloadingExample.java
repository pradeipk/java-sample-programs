package com.p2.polymorphism;

/**
 * 
 * @author pradeep_patel
 * Demonstrate the concept and rule for overloading.
 * Demonstrate the concept and rule for overriding.
 * Demonstrate Duplicate method in a class
 */
public class OverridingAndOverloadingExample {

	public static void main(String[] args) {

		/**If a Parent type reference refers to a Parent object, then Parent's 	show is called*/		
		Parent obj1 = new Parent();
		obj1.show();

		/** If a Parent type reference refers to a Child object Child's show() is called. This is called RUN TIME POLYMORPHISM. */
		Parent obj2 = new Child();
		obj2.show();
	}
}

/**
 * A Simple Java program to demonstrate method overriding in java
 * @author pradeep_patel
 * BaseClass
 */
class Parent {
	
	protected void show() {
		System.out.println("Parent's show()");
	}
	
	public Parent print(Parent p){		
		return p;
	}
	
	/** overloading is the ability to write methods that have the same name but accept different parameters.
	 either the type is different or argument list is different
	 return type does not matters at all in overloading.
	*/
	public int  myMethod(int param) {
		return 3;
	}
	// argument count is different (2 in this case)
    public char myMethod(int param, int parms) {
    	return 'c';
    }
	// argument type is different (char)
    public int  myMethod(char param) {
		return 3;
	}
    
    /**  Having name and signature same both at the same time is not allowed , gives compile time error
    /*public String  myMethod(char param) {
		return "Pradeip";
	}*/
    
}

/** Child class for Parent
 * 
 * @author pradeep_patel
 *
 */
class Child extends Parent {
	// This method overrides show() of Parent
	// You can make public from protected 
	/**
	 * Child class can increase the visibilty 
	 * Child class can not reduce the visibilty
	 */
	
	@Override
	 public void show() {
		System.out.println("Child's show()");
	}
	
	/**This is not overriding since signature has changed.
	 * 
	 * @param p
	 * @param c
	 * @return
	 */
	public Child print(Parent p,String c){		
		System.out.println();
		return (Child)p;
		
	}
	
	/**
	 *  Along with argument type and count,there is a rule for return type as well in overriding.
	 *  return type can be of parent type or its sub-type. 
	 */
	@Override
	public Child print(Parent p){		
		System.out.println();
		return (Child)p;		
	}	
	
	// overloading
	public String print(Parent p,Integer h){		
		System.out.println();
		return null;		
	}	
	
}


/**
 * Overriding is also called as run time polymorphism since the instance is resolved at runtime
 * If method name , argument type and argument list is same then it is a case of duplicate method
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */














