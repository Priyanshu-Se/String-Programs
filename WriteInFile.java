package com.org.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteInFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileName=sc.nextLine();
		
		try {
			FileWriter writer = new FileWriter(fileName);
			
			writer.write("Hello Priyanshu\n");
			writer.write("How are you");
			
			System.out.println("File written successfully");
		} catch (IOException e) {
			System.out.println("Error "+e.getMessage());
		}
	}
}
