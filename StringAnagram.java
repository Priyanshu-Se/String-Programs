package com.org.java;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String str="listen";
		String str2="silent";
		
		if(str.length()==str2.length()) {
			char[] c1 = str.toCharArray();
			char[] c2 = str2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			String string1 = new String(c1);
			String string2 = new String(c2);
			
			if(string1.equals(string2)) 
				System.out.println("The Given String is Anagram");
				else
					System.out.println("The Given String is not Anagram");
		}
		else
			System.out.println("Not Anagram");
	}
}
