package com.org.java;

import java.util.Scanner;

public class ArraySmallest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size for an array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		System.out.println("Enter the elements to an array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
         int temp=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(temp>arr[i]) {
				temp=arr[i];
			}
		}
		System.out.println("The Smallest value in an array is : "+temp);
	}
}
