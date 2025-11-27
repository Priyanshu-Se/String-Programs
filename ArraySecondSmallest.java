package com.org.java;

import java.util.Scanner;

public class ArraySecondSmallest {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elemenmt for an array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secondSmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secondSmallest && arr[i]!=smallest)
				secondSmallest=arr[i];
		}
		System.out.println("Second smallest : "+secondSmallest);
	}
}
