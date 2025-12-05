package com.org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

	public static List<int[]> findPairs(int[] arr, int target){
		List<int[]> result=new ArrayList<int[]>();
		if(arr==null || arr.length<2)return result;
		
		int[] a = Arrays.copyOf(arr, arr.length);
		Arrays.sort(a);
		
		int left=0,right=a.length-1;
		
		while(left<right) {
			long sum=(long) a[left]+a[right];
			
			if(sum==target) {
				result.add(new int[]{a[left],a[right]});
				
				int leftVal=a[left];
				int rightVal=a[right];
				
				while(left<right && leftVal==a[left])left++;
				while(left<right && rightVal==a[right])right--;
				
				}
			else if(sum<target) {
				left++;
			}
			else {
				right--;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] nums = {2, 4, 3, 5, 7, 8, 1, 11};
        int target = 9;

        List<int[]> pairs = findPairs(nums, target);
        for (int[] p : pairs) {
            System.out.println(Arrays.toString(p));
        }    
	}
}
