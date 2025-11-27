package com.org.java;

import java.util.Scanner;

public class FibonacciSearies {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the nth term");
		int n=sc.nextInt();
		
		int first=0,second=1;
		
		System.out.println("Fibonacci series: ");
		while(first<=n) {
			System.out.print(first+" ");
			
			int next=first+second;
			first=second;
			second=next;
		}
		
	}
}
