package com.org.java;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DRowSum {

	public static void main(String[] args) {
		
		int[][] arr = new int [3][3];
		int[] result = new int[arr.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array value");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				
				sum+=arr[i][j];
			}
			result[i]=sum;
		}
		System.out.println(Arrays.toString(result));
	}
}
