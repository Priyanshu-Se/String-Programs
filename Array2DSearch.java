package com.org.java;

import java.util.Scanner;

public class Array2DSearch {

	public static boolean search(int[][] arr,int key) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==key) {
					System.out.println("found at cell ("+i+","+j+")");
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int n=3,m=3;
		int key=5;
		System.out.println("Enter the arrays");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
	}
		
		search(arr, key);
	}
}
