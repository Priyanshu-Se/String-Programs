package com.org.java;

import java.util.*;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Handle division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }

        // Store the sign of result
        boolean isNegative = false;
        if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
            isNegative = true;
        }

        // Convert both to positive manually (no Math.abs)
        if (dividend < 0) dividend = -dividend;
        if (divisor < 0) divisor = -divisor;

        int quotient = 0;
        

        while (dividend >= divisor) {
            dividend = dividend - divisor;
            quotient++;
        }
        if (isNegative) {
            quotient = -quotient;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + dividend);
    }
}