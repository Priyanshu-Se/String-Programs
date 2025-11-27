package com.org.java;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
//		SelectionSort.selectionSort(arr,size);
//		bubbleSort(arr, size);
		insertionSort(arr,size);
	}
	
	public static void bubbleSort(int[] arr,int size) {
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr,int size) {
		
		for(int i=0;i<size-1;i++) {
			int min=i;
			for(int j=i+1;j<size;j++) {
				if(arr[j]<arr[min]) {
					int temp=arr[min];
					arr[min]=arr[j];
					arr[j]=temp;
				}	
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void insertionSort(int[] arr,int size) {
		
		for(int i=1;i<size;i++) {
			int curr=arr[i];
			int prev=i-1;
			
			while(prev>=0 && arr[prev]>curr) {
				arr[prev+1]=arr[prev];
				prev--;
			}
			arr[prev+1]=curr;
		}
		System.out.println(Arrays.toString(arr));
	}
}
