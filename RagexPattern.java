package com.org.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RagexPattern {

	public static void ragexPattern(String re,String str) {
		Pattern pattern = Pattern.compile(re);
		Matcher matcher = pattern.matcher(str);
		boolean matches = matcher.matches();
		System.out.println("result : "+matches);
	}
	public static void main(String[] args) {
//		String ragex ="a";
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the regular expression");
		String re=sc.nextLine();
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		ragexPattern(re, str);
		
		System.out.println("You want to continue Y/N");
		String choice=sc.nextLine();
		if(choice.equalsIgnoreCase("N")) {
			System.out.println("Thank you");
			break;
		}
	}
		
		
		
	}
}
