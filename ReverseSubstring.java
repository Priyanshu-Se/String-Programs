package com.org.java;

public class ReverseSubstring {

	public static void main(String[] args) {
		String str = "abcd";
		String substring = "";

		for (int i =0; i<str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				substring = str.substring(i,j);
				if(isPalindrome(substring)) {
					System.out.println(substring+" is palindrome");
				}
			}
		}
	}

	// Optional: Palindrome checker
	public static boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left++) != s.charAt(right--)) 
				return false;
		}
		return true;
	}
}
