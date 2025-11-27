package com.org.java;

import java.util.*;

public class CombinationSumToTarget {
    public static void main(String[] args) {
        String word = "ADOBECODEBANC";
        String target = "ABC";

        String result = findSmallestWindow(word, target);
        System.out.println("Smallest window: " + result);
    }

    static String findSmallestWindow(String s, String t) {
        int[] need = new int[128];
        for (char c : t.toCharArray()) need[c]++;

        int left = 0, right = 0, count = t.length();
        int minLen = Integer.MAX_VALUE, start = 0;

        while (right < s.length()) {
            if (need[s.charAt(right++)]-- > 0) count--;

            while (count == 0) {
                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }
                if (++need[s.charAt(left++)] > 0) count++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}