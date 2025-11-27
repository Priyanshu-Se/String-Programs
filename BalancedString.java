package com.org.java;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the brackets of string");
		String str=sc.nextLine();
		
		if(isBalanced(str)) {
			System.out.println("The string is balanced");
		}
		else {
			System.out.println("The string is not balanced");
		}
		
	}
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(char ch:str.toCharArray()) {
			if(ch=='('||ch=='{'||ch=='[') {
				stack.push(ch);
			}
			else if(ch==')'||ch=='}'||ch==']') {
				if(stack.isEmpty()) {
					return false;
				}
				char pop = stack.pop();
				if((ch==')' && pop!='(')||(ch=='}' && pop!='{')||(ch==']' && pop!='[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
