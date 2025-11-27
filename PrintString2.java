package com.org.java;

public class PrintString2 {

	public static void main(String[] args) {
		String str="aaabbaaddbb";
		String str3="";
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			String str2 = str.replaceFirst(c+"+", "");
			int count=str.length()-str2.length();
			str3+=c+""+count;
			str=str2;
		}
		System.out.println(str3);
	}
}

