package com.org.java;

public class PrintDuplicates {

	public static void main(String[] args) {
		
		String str="geeksforgeeks";
		String str2="";
		String str3="";
				
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(!str2.contains(""+c)) {
				str2+=c;
			}
			else if(!str3.contains(""+c)) {
				str3+=c;
			}
		}
		System.out.println(str3);
	}
}
