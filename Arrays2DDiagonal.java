package com.org.java;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2DDiagonal {

	public static void main(String[] args) {
		
		int[][] arr=new int[3][3];
		int[] result = new int[arr.length];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of an array");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) {
				if(i==j || i+j==(arr.length-1)) {
					result[i]=arr[i][j];
				}
			}
		}
		System.out.println(Arrays.toString(result));
	}
}
