package com.org.java;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the element of an array");
		
		for(int i= 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] temp = new int[5];
		for(int i=arr.length-1;i>=0;i--)
		{
			temp[arr.length-1-i]=arr[i];
		}
		System.out.println(Arrays.toString(temp));
	}
}
