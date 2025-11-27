package com.org.java;

public class PrintOddIndex {

	public static void printSumDigit(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		System.out.println();
	}
	public static void printEvenIndexSumAndOddIndexSum(int[] arr) {
		int sumEven=0;
		int sumOdd=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				sumEven+=arr[i];
			}
			else {
				sumOdd+=arr[i];
			}
		}
		System.out.println("Sum of even index value :" +sumEven + "Sum of odd index value :" +sumOdd);
	}
	public static void main(String[] args) {
		
		int[] arr= {12,23,45,67,43,21};
		for(int i=0;i<arr.length;i++) {
//			if(i%2>0)System.out.print(arr[i]+" ");
		}
//		printSumDigit(arr);
		printEvenIndexSumAndOddIndexSum(arr);
	}
}
