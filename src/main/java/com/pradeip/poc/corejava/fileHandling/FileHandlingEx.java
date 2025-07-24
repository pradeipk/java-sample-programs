package com.pradeip.poc.corejava.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 
 * @author pradeep_patel
 *Following program depicts how to create/Read/Write a text file using FileInputStream/FileOutputStream
 */
public class FileHandlingEx {
	public static void main(String[] args) throws Exception{
		//FileOperations.createFile(null);
		//FileOperations.deleteFile();
		FileOperations.readAndWriteToAFile();
	}
}

/**
 * The java.io package contains nearly every class you might ever need to
 * perform input and output (I/O) in Java.
 * 
 * @author pradeep_patel sample code on File Operation--
 */

class FileOperations {

	static File file = null;
	static String sepertor = "\\";
	static String path0 = "D:" + sepertor + "Technical Tutorial";

	/**
	 * 
	 * @param path
	 * @return File Create file at specified path
	 */
	public static File createFile(String path) {

		try {
			if (null == path || path.isEmpty())
				path = path0;
			System.out.println("File Created at:" + path);
			file = new File(path + sepertor + "p.txt");
			boolean createNewFile = file.createNewFile();
			System.out.println("File Created = " + createNewFile);
		} catch (Exception e) {
			System.out.println(e.getClass());
		}

		return file;
	}

	/**
	 * Delete the given file
	 */
	public static void deleteFile() {
		if (null == file)
			createFile(path0);
		boolean isDeleted = file.delete();
		System.err.println("File Deleted :" + isDeleted);
	}

	/**
	 * Read from a file and write to another file
	 * @throws IOException
	 */
	public static void readAndWriteToAFile() throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (Exception e) {
			System.out.println("Exception Thrown By Read And Write Method :"+ e.getClass());
		} finally {

			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

	}

	/*
	 * public static void readFile() { if (null == file) createFile(path0);
	 * 
	 * FileInputStream fis = new FileInputStream(file); // InputStreamReader isr
	 * = new InputStreamReader(fis, cs); // BufferedReader br = new
	 * BufferedReader(isr);
	 * 
	 * String line; while ((line = br.readLine()) != null) { // process the line
	 * System.out.println(line); } br.close(); }
	 */
}