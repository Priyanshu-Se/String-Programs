package com.org.java;

import java.util.Scanner;

public class ArraySecondLargest {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elemenmt for an array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondLargest=largest;
				largest=arr[i];
			}
			else if(secondLargest>arr[i] && arr[i]!=largest)
			{
				secondLargest=arr[i];
			}
		}
		System.out.println("Second largest : "+secondLargest);
	}
}
