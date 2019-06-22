package com.pradeip.poc.corejava.collections;


import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {	
		
		Set<Integer> set = new TreeSet<Integer>();
		//Set<Integer> set = new HashSet<Integer>();		
		set.add(23);
		set.add(35);
		set.add(56);
		set.add(78);
		// null can not be stored in sorted set
		set.add(null);
		
		for (Integer integer : set) {
			System.out.println(integer);
		}

	}

}
