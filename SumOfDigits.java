package com.org.java;

public class SumOfDigits {

	public static void main(String[] args) {
		
		String str="hello125";
		int sum=0;
		
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c>='0'&& c<='9') {
				sum+=c-'0';
			}
		}
		System.out.println(sum);
	}
}


