package com.org.java;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr,int key) {
		
		Arrays.sort(arr);
		
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(arr[mid]==key) {
				return mid;
			}
			else if(arr[mid]<key) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		System.out.println("Enter the Arrays");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the key");
		int key=sc.nextInt();
		
		int binarySearch = binarySearch(arr, key);
		if(binarySearch==-1) {
			System.out.println("key not found");
		}
		else {
			System.out.println("index of the key is "+binarySearch);
		}
		
	}
}
