package com.org.java;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DColumnSum {

	public static void main(String[] args) {
		int[][] arr=new int[3][4];
		int[] result=new int[arr[0].length];
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array value");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<result.length;i++) {
			
			int sum=0;
			for(int j=0;j<arr.length;j++) {
				sum+=arr[j][i];
			}
			result[i]=sum;
		}
		System.out.println(Arrays.toString(result));
	}
}
