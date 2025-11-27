package com.org.java;
	import java.util.Arrays;

	public class MergeSort {

	    public static void main(String[] args) {
	        int[] arr = {12, 34, 2, 4, 67, 23, 45};
	        int[] temp = new int[arr.length];

	        mergeSort(arr, temp, 0, arr.length - 1);

	        System.out.println("Sorted array: " + Arrays.toString(arr));
	    }

	    public static void mergeSort(int[] arr, int[] temp, int start, int end) {
	        if (start < end) {
	            int mid = (start + end) / 2;

	            mergeSort(arr, temp, start, mid);
	            mergeSort(arr, temp, mid + 1, end);
	            merge(arr, temp, start, mid, end);
	        }
	    }

	    public static void merge(int[] arr, int[] temp, int start, int mid, int end) {
	        int i = start;
	        int j = mid + 1;
	        int k = start;

	        while (i <= mid && j <= end) {
	            if (arr[i] < arr[j]) {
	                temp[k] = arr[i];
	                i++;
	            } else {
	                temp[k] = arr[j];
	                j++;
	            }
	            k++;
	        }

	        while (i <= mid) {
	            temp[k] = arr[i];
	            i++;
	            k++;
	        }

	        while (j <= end) {
	            temp[k] = arr[j];
	            j++;
	            k++;
	        }

	        for (int index = start; index <= end; index++) {
	            arr[index] = temp[index];
	        }
	    }
	}


