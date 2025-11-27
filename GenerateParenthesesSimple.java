package com.org.java;
import java.util.*;

public class GenerateParenthesesSimple {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        System.out.println("All combinations: " + result);
    }

    static void generate(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max)
            generate(result, current + "(", open + 1, close, max);

        if (close < open)
            generate(result, current + ")", open, close + 1, max);
    }
}
