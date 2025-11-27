package com.org.java;

import java.util.HashMap;

public class Demo {

	public static void main(String[] args) {
		int count=0;
		
		String str="IND UN IND PAK UK UK IND";
		String[] arr=str.split(" ");
		HashMap <String,Integer>h=new HashMap<String,Integer>();
		
		for (String s1 : arr) {
			for (String s2 : arr) {
				if(s1.equals(s2))
				{
					count++;
				}
			}
			h.put(s1, count);
			count=0;
		}
		
	
		System.out.println(h);
	}

}
