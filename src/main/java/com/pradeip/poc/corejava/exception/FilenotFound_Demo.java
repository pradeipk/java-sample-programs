package com.p2.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// sample code to show checked or compile time exception exception .
public class FilenotFound_Demo {

	public static void main(String args[]) {
		File file = new File("E://file.txt");
		// if you you remove try-catch block here you will not be able to compile. 
		// other way is to declare your method to thorws Exception 
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public void demo_throws () throws FileNotFoundException{		
		File file = new File("E://file.txt");
		FileReader fr = new FileReader(file);
	}
	
}