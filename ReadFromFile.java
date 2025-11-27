package com.org.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileName=sc.nextLine();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			String line;
			
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error "+e.getMessage());
		}
	}
}
