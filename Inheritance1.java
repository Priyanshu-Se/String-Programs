package com.org.java;
 class A{
	public static void m1(){
		System.out.println("hello");
	}
}
 class B extends A{
	public static void m2() {
		System.out.println("hii");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}
}


