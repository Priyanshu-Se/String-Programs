package com.org.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class WordDuplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the filename");
		String fileName=sc.nextLine();
		
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> duplicates = new ArrayList<String>();
		
		try {
			BufferedReader br= new BufferedReader(new FileReader(fileName));
			String line;
			
			while((line=br.readLine())!=null) {
				String[] word = line.split("\\s+");
				
				for(String w:word) {
					if(w.isEmpty())continue;
					
					String lowerCase = w.toLowerCase();
					
					if(words.contains(lowerCase)) {
						if(!duplicates.contains(lowerCase)) {
							duplicates.add(lowerCase);
						}
					}
					else {
						words.add(lowerCase);
					}
				}
			}
				
				if(duplicates.isEmpty()) {
					System.out.println("No words found");
				}
				else {
					System.out.println("Duplicate words are:");
					for(String dup:duplicates) {
						System.out.println(dup);
					}
				}
		} catch (Exception e) {
			System.out.println("Error "+e.getMessage());
		}
	}
}
