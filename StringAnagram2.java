package com.org.java;

public class StringAnagram2 {

	public static void main(String []args) {
		String str="care";
		String str2="race";
		
		if(str.length()==str2.length()) {
			
			while(str.length()!=0) {
				char ch = str.charAt(0);
				
				String s1=str.replace(ch+"", " ");
				String s2=str2.replace(ch+""," ");
				
				if(s1.length()!=s2.length()) {
					System.out.println("Not Anagram");
				}
				
				str=s1;
				str2=s2;
			}
			System.out.println("Anagram");
		}
		else {
		System.out.println("Not Anagram");
		}
	}
}
