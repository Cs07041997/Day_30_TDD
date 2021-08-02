package com.bridgelabz.program;

import java.io.FileInputStream;
import java.io.IOException;

public class Read {

	public static void main(String[] args) throws IOException {
		FileInputStream fir = new FileInputStream("D:\\lmn.txt");
		int data = fir.read();
		int data1 = fir.read();
		System.out.println(data);
		System.out.println(data1);
		fir.close();
		

	}

}
