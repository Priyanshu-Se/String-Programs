package com.org.java;

import java.util.Arrays;

public class Arrays1 {

	public static void enterAtFirst(int[] arr, int value) {

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = value;

	}

	public static void enterAtMiddle(int[] arr, int midValue) {

		int mid = arr.length / 2;
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[mid] = midValue;

	}
	
	public static void addElementPosition(int[] arr,int pos,int value) {
		
		int[] arr2= new int[arr.length+1];
		
		//System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<pos-1;i++) {
			arr2[i]=arr[i];
		}
		arr[pos-1]=value;
		
		for(int i=pos;i<arr.length-1;i++) {
			arr2[i]=arr[i-1];
		}
		System.out.println(Arrays.toString(arr2));

	}

	public static void main(String[] args) {

		int[] arr = new int[] {2,6,5,8,4,9,1,5,8,2,9};
		
		
		int value = 89;
		int pos=3;
		int midValue = 7;

		// enterAtFirst(arr, value);

		//enterAtMiddle(arr, midValue);
		
		addElementPosition(arr, value, pos);

		System.out.println(Arrays.toString(arr));
	}
}
