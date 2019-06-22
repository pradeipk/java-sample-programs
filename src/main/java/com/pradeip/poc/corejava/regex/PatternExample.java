package com.pradeip.poc.corejava.regex;


import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		//Regular Expression Character classes Example
		 String [] lsit  = {"[abc]","[^abc]","[a-zA-Z]","[a-d[m-p]]","[a-z&&[def]]","[a-z&&[^bc]]","[a-z&&[^m-p]]"};
				
		Regex.checkMatch("....s.", "Mahesh");
		// 
		Regex.checkMatch(lsit[2], "adfewtwetryre");
		
		
		
	}
}

class Regex {

	static void checkMatch(String matcher, String matches) {
		boolean b = Pattern.matches(matcher, matches);
		System.out.println(b);

	}

}