package com.org.java;

public class PrintString {

	public static void main(String[] args) {
		
		String str="a3b2d2";
		String str2="";
		
		for(int i=0;i<str.length();i+=2){
			char c = str.charAt(i);
			char c2 = str.charAt(i+1);
			int count=c2-'0';
			for(int j=0;j<count;j++) {
				str2+=c;
			}
		}
		System.out.println(str2);
	}
}