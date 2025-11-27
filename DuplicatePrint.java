package com.org.java;

public class DuplicatePrint {

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String str3 = "";
        String temp=str;

        for (int i = 0; i < temp.length(); i++) {
            char c = temp.charAt(i);
            String str2 = str.replace(c + "", "");
            int count = str.length() - str2.length();

            if (count > 1) {
                if (!str3.contains(c + "")) {
                    str3 += c;
                }
            }
        }
        System.out.println(str3);
    }
}
