package com.pradeip.poc.corejava.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * * Sample code to show how to copy file from one location to another.
 */
public class CopyFile {

	public static void main(String args[]) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		File file = null;
		try {
			
			file = new File(".");
			for(String fileNames : file.list()) System.out.println(fileNames);	
			file = new File("C://Users//resource//input.txt");
			System.out.println(file.getAbsolutePath());
			in = new FileInputStream(file.getAbsolutePath());
			//out = new FileOutputStream("D:\\JavaPracticeWorkSpace\\SamplePractise\\resource\\output.txt");

			/*int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}*/
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
