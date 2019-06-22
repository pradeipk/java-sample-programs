package com.p2.jvm;

public class NewInstanceExample {
	java.lang.String name = "GeeksForGeeks";

	public static void main(String[] args) {
		try {
			Class cls = Class.forName("NewInstanceExample");
			NewInstanceExample obj = (NewInstanceExample) cls.newInstance();
			System.out.println(obj.name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}