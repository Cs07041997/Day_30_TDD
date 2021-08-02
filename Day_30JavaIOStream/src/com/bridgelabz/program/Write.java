package com.bridgelabz.program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
		public static void main(String[] args) throws IOException {
			FileOutputStream fir = new FileOutputStream("fre.txt");
			 fir.write(3);
			System.out.println("hey");
			fir.close();

	}

}
