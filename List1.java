package com.org.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class List1 {

	public static void main(String[] args) {
		List<Integer> list = List.of(12,34,23,45,56,89,90,65,23);
		
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		
//		for (Integer i : list) {
//			if(i%2==0) {
//				list2.add(i);
//			}
//			
//		}
//		System.out.println(list2);
		
//		List<Integer> list2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(list2);
		
//		list.stream().sorted().forEach(System.out::println);
//		list.stream().distinct().forEach(System.out::println);
		
		list.stream().sorted(Comparator.reverseOrder()).limit(2).forEach(System.out::println);
	}
}
