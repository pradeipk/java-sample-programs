package com.pradeip.poc.corejava.io;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class CurrentDirectoryAndPath {

	public static void main(String[] args) throws IOException {
		File currentDirFile = new File(".");
		String path = currentDirFile.getAbsolutePath();
		
		System.out.println(path);

		Properties properties = System.getProperties();
		System.out.println(properties.get("user.dir"));		
		File f = new File(properties.get("user.dir")+"\\map1.json" );		
		System.out.println(f.getAbsolutePath());		
		
		/*properties.get("user.dir");
		Enumeration<Object> enumeration = properties.keys();
		for (int i = 0; i < properties.size(); i++) {
			Object obj = enumeration.nextElement();
			System.out.println("Key: " + obj + "\tOutPut= "
					+ System.getProperty(obj.toString()));
		}*/

	}
}
