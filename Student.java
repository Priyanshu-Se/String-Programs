package com.org.java;

import java.util.Arrays;

public class Student implements Comparable<Student> {

	String name;
	int mark;
	
	public Student(String name,int mark) {
		this.name=name;
		this.mark=mark;
	}
	

	@Override
	public int compareTo(Student o) {
		return this.mark-o.mark;
	}
	
	public static void main(String[] args) {
		Student student1 = new Student("Aditya", 78);
		Student student2 = new Student("Ram", 45);
		Student student3 = new Student("Shiv",89);
		
		
		Student[] student= {student1,student2,student3};
		Arrays.sort(student);
		
		for(Student students:student) {
			System.out.println(students);
		}
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + "]";
	}

}
