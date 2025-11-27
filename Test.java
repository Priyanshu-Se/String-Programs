package com.org.java;

public class Test {

	public static void main(String[] args) {
		
		String str ="madam";
		String s1="";
		int l=str.length();
		
		for(int i=l-1;i>=0;i--) {
			char c = str.charAt(i);
			s1+=c;
			
		}
		
		if(str.equals(s1))
		{
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}
	}
}
