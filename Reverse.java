package com.org.java;

public class Reverse {

	public static void main(String[] args) {
		System.out.println(reverse(123));
		System.out.println(reverse(-234));
		System.out.println(reverse(123645876));
	}
	
	public static int reverse(int value) {
		long reversed=0;
		
		while(value!=0) {
			int digit=value%10;
			reversed=reversed*10+digit;
			value/=10;
		}
		
		if(reversed<Integer.MIN_VALUE && reversed>Integer.MAX_VALUE) {
			return 0;
		}
		return (int)reversed;
	}
}
