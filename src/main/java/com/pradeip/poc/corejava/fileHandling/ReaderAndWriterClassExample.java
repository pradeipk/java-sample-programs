package com.p2.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterClassExample {
	static FileWriter fw;
	static String sepertor = "\\";
	static String path = "D:" + sepertor + "Technical Tutorial" + sepertor
			+ "demo.txt";
	static String SAMPLE_STRING = "Hello Pradeip, watsapp , What is going on";

	public static void main(String[] args) throws IOException {

		fw = FileWriterDemo.createFile(path, SAMPLE_STRING);

		if (fw != null)
			WordCountInFile.countWord(path);
		else
			System.out.println("File was Not found ");
		//Reading File using FileReader
		FileReaders.FileReader(path);		
	}
}

/**
 * 
 * @author pradeep_patel
 *
 */

class FileWriterDemo {
	static String sepertor = "\\";

	static <T> T createFile(String path, String sampleString)
			throws IOException {

		File file = new File(path);
		// attach a file to FileWriter
		// this will also work
		// new FileWriter(file);
		FileWriter fw = new FileWriter(path);
		// read character wise from string and write
		// into FileWriter
		for (int i = 0; i < sampleString.length(); i++)
			fw.write(sampleString.charAt(i));
		// close the file
		System.out.println("Closing File Writer ---- >");
		fw.close();
		return (T) fw;
	}
}

/**
 * Read more on File handling at
 * http://www.geeksforgeeks.org/file-handling-java-using-filewriter-filereader/
 * 
 * 
 */

/**
 * 
 * @author pradeep_patel
 *
 */
class WordCountInFile {

	public static void countWord(String path) {
		BufferedReader reader = null;
		// Initializing charCount, wordCount and lineCount to 0
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;

		try {
			// Creating BufferedReader object
			reader = new BufferedReader(new FileReader(path));
			// Reading the first line into currentLine
			String currentLine = reader.readLine();
			while (currentLine != null) {
				// Updating the lineCount
				lineCount++;
				// Getting number of words in currentLine
				String[] words = currentLine.split(" ");
				// Updating the wordCount
				wordCount = wordCount + words.length;
				// Iterating each word
				for (String word : words) {
					// Updating the charCount
					charCount += word.length();
				}
				// Reading next line into currentLine
				currentLine = reader.readLine();
			}

			// Printing charCount, wordCount and lineCount

			System.out.println("Number Of Chars In A File : " + charCount);
			System.out.println("Number Of Words In A File : " + wordCount);
			System.out.println("Number Of Lines In A File : " + lineCount);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close(); // Closing the reader
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class FileReaders {
	static FileReader fr;

	static void FileReader(String path) throws IOException {
		System.out.println("Reading file using File Reader Line - Code@124");
		int ch;
		try {
			fr = new FileReader(path);
		} catch (FileNotFoundException fe) {
			System.out.println("File not found");
		}
		// read from FileReader till the end of file
		while ((ch = fr.read()) != -1)
			System.out.print((char) ch);
		// close the file
		fr.close();
	}
}
