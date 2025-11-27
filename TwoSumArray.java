package com.org.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumArray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter an arrays");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target value");
		int target=sc.nextInt();
		
		int[] result = twoSum(arr, target, size);
		
		if(result.length>0) {
			System.out.println("index: ["+result[0]+","+result[1]+"]");
		}
		else {
			System.out.println("No index found");
		}
	}
	
	public static int[] twoSum(int[] arr,int target,int size) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<size;i++) {
			int complement=target-arr[i];
			
			if(map.containsKey(complement)){
				return new int[] {map.get(complement),i};
			}
			map.put(arr[i],i);
		}
		
		return new int[] {};
		
	}
}
