package com.org.java;

public class RotationOfCharacter {

	public static void main(String[] args) {
		String str = "abc";
		String str2 = "cab";
		
		if (str.length() == str2.length()) {
			String str3 = str + str;
			if (str3.contains(str2))
					System.out.println(str2 + " is the rotation " + str);
				else

					System.out.println(str2 + " is not the rotation " + str);
		}
	}
}
