package com.org.java;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number for the given array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(Arrays.toString(arr[i]));
		}
	}
}
