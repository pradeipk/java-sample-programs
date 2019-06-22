package com.pradeip.poc.corejava.wrapper;

/**
 * 
 * @author pradeep_patel
 * 
 * Demonstrate ValueOf(),ValueOf(.. , .. ), parseXXX(), xxxValue()
 *
 */


public class WrapperExamples {

	public static void main(String[] args) {

		Integer I = Integer.valueOf("10");
		System.out.println(I);
		
		I = Integer.valueOf("1111", 2);
		System.out.println("Radix: " +I);
		
		I = Integer.valueOf("128");
		
		// byteValue
		System.out.println("Byte Value: " +I.byteValue());
        System.out.println(I.shortValue());
        System.out.println(I.intValue());
        System.out.println(I.longValue());
        System.out.println(I.floatValue());
        System.out.println(I.doubleValue());
		
		
		Double D = Double.valueOf("10.0");
		System.out.println(D);
		Boolean B = Boolean.valueOf("true");
		System.out.println(B);
		// Here we will get RuntimeException
		//Integer I1 = Integer.valueOf("ten");
		
		
		int i = Integer.parseInt("10");
        double d = Double.parseDouble("10.5");
        boolean b = Boolean.parseBoolean("true");
        System.out.println(i);
        System.out.println(d);
        System.out.println(b);	
		
	}
}
