package com.org.java;

public class StackImplemenetation {

	int maxSize;
	int top;
	int[] stack;

	public StackImplemenetation(int size) {
		maxSize = size;
		top = -1;
		stack = new int[maxSize];
	}

	public void push(int value) {
		if(isFull()) {
			System.out.println("Stack is overflow");
			return;
		}
		stack[++top]=value;
		System.out.println("Value pushed");
	}

	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stack[top--];
	}

	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return stack[top];
	}

	public boolean isEmpty() {
		return (top==-1);
	}

	public boolean isFull() {
		return (top==maxSize-1);
	}
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		
		System.out.println("Stack elements:");
		for(int i=0;i<=top;i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		StackImplemenetation s = new StackImplemenetation(5);

		s.push(10);
		s.push(20);
		s.push(30);
		s.push(50);
		s.push(80);
		
		System.out.println("Top value"+s.peek());
		System.out.println("Remove an element"+s.pop());
		s.display();
	}
}
