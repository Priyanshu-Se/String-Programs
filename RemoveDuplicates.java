package com.org.java;


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String str="geeks for geeks";
		String str2="";
		
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(!str2.contains(c+"")){
			str2+=str.charAt(i);
			}
		}
		System.out.println(str2);
	}
	
}
	
