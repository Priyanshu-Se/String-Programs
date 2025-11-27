package com.org.java;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class StraemAPI {

	public static void main(String[] args) {
		
//		Write a stream code to get even numbers from a list of integers?
//		List<Integer> of = List.of(12,21,3,45,56,24);
//		List<Integer> collect = of.stream().filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(collect);
		
//		How would you get the second highest salary from a list of Employee objects using Stream
		List<Integer> sal = List.of(12000,23000,34500,23450);
		Optional<Integer> sal2 = sal.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
		sal2.ifPresent(s->System.out.println(sal2));

	}
}
