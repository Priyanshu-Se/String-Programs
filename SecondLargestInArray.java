package com.org.java;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestInArray {
	
	public static void secondLargest(int[] arr) {
		Arrays.sort(arr);
		
		int largest=arr[arr.length-1];
		for(int i=arr.length-2;i>0;i++) {
			if(arr[i]<largest) {
				System.out.println("Second Largest "+arr[i]);
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the arrays");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		secondLargest(arr);
		
		
	}
}
