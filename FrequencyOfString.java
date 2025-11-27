package com.org.java;

public class FrequencyOfString {
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String temp = str;
		String str3 = "";
		int maxOccurance=0;
		char maxElement=str.charAt(0);

		for (int i = 0; i < temp.length(); i++) {
			char c = temp.charAt(i);

			if (!str3.contains(c + "")) {
				String str2 = str.replace(c + "", "");
				int count = str.length() - str2.length();

//				System.out.println(c + ":-" + count);
				str3 += c;
				
				if(count>maxOccurance) {
					maxOccurance=count;
					maxElement=c;
				}
			}
		}
		System.out.println(maxElement+"->"+maxOccurance);

	}
}
