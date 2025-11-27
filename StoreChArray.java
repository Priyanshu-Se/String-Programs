package com.org.java;

public class StoreChArray {

	public static void main(String[] args) {
		char[] charArray = {'a','b','c','d','e'};
		
		//original array
		for(int i=0;i<charArray.length;i++) {
			char c = charArray[i];
			System.out.print(c+" ");
		}
		System.out.println();
			//reverse order
			for(int i=charArray.length-1;i>=0;i--) {
				char c = charArray[i];
				System.out.print(c+" ");
			}
	}
}
