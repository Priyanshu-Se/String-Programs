package com.org.java;

public class LinearSearch {

	public static int linearSearch(int[] arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1; 
	}
	
	public static int linearSearch(String[] fruits, String keyFruits) {
		for(int s=0;s<fruits.length;s++) {
			if(fruits[s]==keyFruits) {
				return s;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {12,34,5,56,2,54};
		int key=5;
		String[] friuts= {"Apple","Bannana","Grapes","Cocunut"};
		String keyFruits="Bannana";
		
		int linearSearch = linearSearch(friuts, keyFruits);
		if(linearSearch==-1) {
			System.out.println("key not found");
		}
		else {
			System.out.println("key at index "+linearSearch);
		}
		
		
		
//		int linearSearch = linearSearch(arr, key);
//		if(linearSearch==-1) {
//			System.out.println("key not found");
//		}
//		else {
//			System.out.println("key at index "+linearSearch);
//		}
		
	}
}
