package com.bridgelabz.program;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageReader {

	public static void main(String[] args) {
		 int width = 963;
		 int height = 640;
		 
		 //for storing image in ram
		 BufferedImage image = null;
		 
		 //Read image
		 try {
			 File input_file = new File("C:\\Users\\chandan kumar singh\\Desktop\\Untitled.png");
			 image = new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
			 
			 //Reading input file
			  image = ImageIO.read(input_file);
			  System.out.println("Reading complete");
			
		} catch (IOException e) {
			System.out.println("Error" +e);
		}
		 //Write Image
		 try {
			 //output file path
			 
			 File output_file = new File("C:\\Users\\chandan kumar singh\\Desktop\\Out.png");
			 // Writing to file taking type and path as
			 ImageIO.write(image,"jpg", output_file);
			 System.out.println("writing complete");
			
		} catch (IOException e) {
			System.out.println("error" +e);
		}
		 
			
		 

	}

}
