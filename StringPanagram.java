package com.org.java;

public class StringPanagram {

	public static void main(String[] args) {

		String str = "abcdefghijklmnopqrstuvwxyz";
		String str2="";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c>='a'&& c<='z')
				if(!str2.contains(c+""))
					str2+=c;
		}
		if(str2.length()==26)
			System.out.println("The Given String is Panagram");
		else
			System.out.println("The Given String is not Panagram");
	}
}
