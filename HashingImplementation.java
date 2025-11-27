package com.org.java;
import java.util.HashMap;

public class HashingImplementation {
    public static void main(String[] args) {
    	
        HashMap<String, Integer> map = new HashMap<>();

        // Insert values
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Retrieve a value
        System.out.println("Alice's age: " + map.get("Alice"));

        // Check if key exists
        if (map.containsKey("Bob")) {
            System.out.println("Bob is present");
        }

        // Iterate
        for (String key : map.keySet()) {
            System.out.println(key + " → " + map.get(key));
        }

        // Remove
        map.remove("Charlie");
        System.out.println("After removing Charlie: " + map);
    }
}
