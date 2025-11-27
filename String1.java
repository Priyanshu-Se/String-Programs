package com.org.java;

public class String1 {

	public static void main(String[] args) {
		String str = "a1b2c3";
		String nch = " ";
		String ch = " ";
		
//		char[] chr = str.toCharArray();
//		System.out.println(chr);
//		
		for(int i=0;i<str.length();i++) {
			char charAt = str.charAt(i);
			
			if(charAt>='a' && charAt<='z') {
				ch+=charAt;
			}
			else {
				nch+=charAt;
			}
		}
		
		System.out.println(ch+" "+nch);
	}
}
