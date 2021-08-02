package com.bridgelabz.program;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadWhile {

	public static void main(String[] args) throws IOException {
		FileInputStream fir = new FileInputStream("C:\\Users\\chandan kumar singh\\Desktop\\New Text Document (11).txt");
		int data;
		while((data = fir.read())!=-1) {
			System.out.println(data);
			//System.out.println("data"+data+" " +(char)data);
			
			
		}
		fir.close();
	}

}
