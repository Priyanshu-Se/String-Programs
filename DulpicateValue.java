package com.org.java;

import java.util.ArrayList;
import java.util.TreeSet;

public class DulpicateValue {

	public static void main(String[] args) {
		
		ArrayList a=new ArrayList();
		a.add(12);
		a.add(1);
		a.add(34);
		a.add(45);
		a.add(1);
		System.out.println(a);
		TreeSet t1 =new TreeSet(a);
		System.out.println(t1);
	}
}