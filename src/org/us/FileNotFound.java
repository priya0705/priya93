package org.us;

import java.io.*;

public class FileNotFound {

	
	public static void main(String[] args) {
	 
	 File f= new File("C:\\Users\\Acer\\Desktop\\pf.txt");
	 
	 try{
		FileInputStream fs=new FileInputStream(f) ;
	
		System.out.println("file readed");
	 }
     catch(FileNotFoundException fe){
    	 System.out.println("There is no file");
     }
	}

}
