package com.org.java;

import java.util.Scanner;

public class SpiralMatrix {

	public static void spiralMatrix(int[][] arr) {
		
		int startRow=0,startCol=0,endRow=arr.length-1,endCol=arr[0].length-1;
		while(startRow<=endRow && startCol<=endCol) {
			for(int j=startCol;j<=endCol;j++) {
				System.out.print(arr[startRow][j]);
			}
			for(int i=startRow+1;i<=endRow;i++) {
				System.out.print(arr[i][endCol]);
			}
			for(int j=endCol-1;j>=startCol;j++) {
				if(startRow==endRow)
					break;
				System.out.print(arr[endRow][j]);
			}
			for(int i=endRow-1;i>=startRow+1;i++) {
				if(startCol==endCol) {
					break;
				}
				System.out.print(arr[i][startCol]);
			}
			startRow++;
			startCol++;
			endRow--;
			endCol--;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arrays");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
			}
		}
		spiralMatrix(arr);	
	}
}
