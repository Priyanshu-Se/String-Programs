package com.org.java;

import java.util.Scanner;

public class ArrayLargest {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elemenmt for an array");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
         int temp=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(temp<arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println("The largest value in an array is : "+temp);
	}
}
