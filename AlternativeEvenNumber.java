package com.org.java;

public class AlternativeEvenNumber {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				count++;
			if(count%2==1) {
				System.out.println(i);
				}
			}
		}
	}	
}
