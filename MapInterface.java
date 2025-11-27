package com.org.java;

import java.util.HashMap;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		                                                                                              
		HashMap<Integer, String> h = new HashMap<>();
		
		h.put(1,"Aditya");
		h.put(2, "Shiv");
		h.put(3,"Ram");
		h.put(4,"Lakshman");
		System.out.println(h);
		
		HashMap<Integer,String> h2=new HashMap<>();
		h2.put(5, "Raghav");
		h2.put(6, "Papu");
		h2.put(7, "Raju");
		
		h.putAll(h2);
		
		//get() will return the specified value for the specified key
		String s1 = h.get(3);
		System.out.println(s1);
		
		h.remove(1);
		System.out.println(h);
		
		boolean empty = h.isEmpty();
		System.out.println(empty);
		
		boolean containsKey = h.containsKey(2);
		System.out.println(containsKey);
		
		boolean containsValue = h.containsValue("Raghav");
		System.out.println(containsValue);
		
		
		int size = h.size();
		System.out.println(size);
		
		//h.clear();
		System.out.println(h);
		
		Set<Integer> keySet = h.keySet();
		System.out.println(keySet);
		
		
	}
}
