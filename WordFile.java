package com.org.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter the filename");
		String fileName=sc.nextLine();
		
		System.out.println("Enter the word");
		String word=sc.next();
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		
		String line;
		int count=0;
		
		while((line=br.readLine())!=null) {
			String[] words = line.split("\\s+");
			for(String w:words) {
				if(w.equalsIgnoreCase(word)) {
					count++;
				}
			}
		}
		System.out.println("The word "+word+" occures "+count+" times in the file");
			}
		catch(IOException e) {
			System.out.println("error message:"+e.getMessage());
			
		}
		
	}
}
