package com.pradeip.poc.corejava.io;

import java.io.*;
class Example {  
   public static void main(String args[]) throws IOException
   {
      FileInputStream fis = null;
      fis = new FileInputStream("D:/myFile.txt"); 
      int k; 

      while(( k = fis.read() ) != -1) 
      { 
	   System.out.print((char)k); 
      } 
      fis.close(); 	
   }
}
