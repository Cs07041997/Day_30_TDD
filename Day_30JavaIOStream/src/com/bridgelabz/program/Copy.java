package com.bridgelabz.program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException {
		FileInputStream fir = new FileInputStream("D:\\klm.txt");
        FileOutputStream fis = new FileOutputStream("dfg.txt");
        int data;
        while((data=fir.read())!=-1) {
        	fis.write(data);
        	System.out.println("copied successfully");
        	System.out.println(data);
        }
	}

}
