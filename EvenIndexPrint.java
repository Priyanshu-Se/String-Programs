package com.org.java;

public class EvenIndexPrint {

	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5,6};
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
