package com.org.java;

public class PasswordValidator {

	public static boolean isValid(String password) {
		if(password.contains(" "))return false;
		
		if(password.length()<8 && password.length()>12)return false;
		
		boolean hasDigit = false;
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasSpecial = false;
		
		String special="@#$%&!";
		
		for(char ch : password.toCharArray()) {
			if(Character.isDigit(ch))hasDigit=true;
			else if(Character.isLowerCase(ch))hasLowerCase=true;
			else if(Character.isUpperCase(ch))hasUpperCase=true;
			else if(special.indexOf(ch)!=-1)hasSpecial=true;
		}
		
		return hasDigit && hasLowerCase && hasUpperCase && hasSpecial;
	}
	
	public static void main(String[] args) {
		String password = "Abcde@123";

        if (isValid(password)) {
            System.out.println("Password is VALID");
        } else {
            System.out.println("Password is INVALID");
        }
	}
}
