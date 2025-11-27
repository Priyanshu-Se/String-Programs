package com.org.java;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DRowIntoColumn {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][3];
		int[][] result = new int[3][3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element for an array");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				result[j][i]=arr[i][j];
			}
		}
		
//		for(int i=0;i<result.length;i++) {
//			System.out.println(Arrays.toString(result[i]));
//		}
		for(int[] rows:result)
		System.out.println(Arrays.toString(rows));
	}
}
