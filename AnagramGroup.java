package com.org.java;

import java.util.*;

public class AnagramGroup {
    public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> map = new HashMap<>();

        for (String w : words) {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars); // same key for anagrams

            if (!map.containsKey(key))
                map.put(key, new ArrayList<>());

            map.get(key).add(w);
        }

        System.out.println("Grouped anagrams: " + new ArrayList<>(map.values()));
    }
}