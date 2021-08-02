package com.bridgelabz.program;

import java.io.File;

public class ReadofFile {

	public static void main(String[] args) {
		File directory = new File("C:\\Users\\chandan kumar singh\\DesktopNew Text Document (11)") ;
        // creating an array to store all file
String[]  fileList =  directory.list();

if(fileList == null ) {
	System.out.println("No file in directory");
}
else {
	for (int i = 0 ; i < fileList.length;i++) {
		String fileName = fileList[i];
		if(fileName.equalsIgnoreCase("Csv")){                       
			System.out.println(fileName +" " + "found");}
		else { 
			System.out.println("not found");
		}
	}
}

	}

}
