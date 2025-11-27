package com.org.java;

public class Vowels {

	public static void main(String[] args) {
		
		String str="Abh76Bn4S$_4A";
		
		String vowel="",cons="",lower="",upper="",special="",number="";
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			if(c>='A'&& c<='Z') {
				upper+=c;
				if(c=='A'|c=='E'|c=='I'|c=='O'|c=='u') {
					vowel+=c;
				}
				else 
				{
					cons+=c;
				}
			}
			else if(c>='a' && c<='z'){
				lower+=c;
				if(c=='a'|c=='e'|c=='i'|c=='o'|c=='u') {
					vowel+=c;
				}
				else {
					cons+=c;
				}
			}
			else if(c>='0' && c<='9'){
				number+=c;
			}
			
			else {
				special+=c;
			}
			
		}
	
		System.out.println("Uppercase :" + upper + " Lowercase :" + lower + " Vowels :" + vowel + " Consnatnt :" + cons
				+ " Number :"+number+" Special :" + special);
	}
	
}
