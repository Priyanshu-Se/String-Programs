package com.org.java;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n=sc.nextInt();
		
		BigInteger fact=BigInteger.ONE;
		for(int i=1;i<=n;i++) {
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println("The factorial of the number is : "+fact);
	}
}
