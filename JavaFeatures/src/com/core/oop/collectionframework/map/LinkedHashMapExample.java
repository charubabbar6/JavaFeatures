package com.core.oop.collectionframework.map;

import java.util.LinkedHashMap;
import java.util.Map;
//LinkedHashMap: Maintains insertion order. Allows null keys and values.
public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 25);
        linkedHashMap.put("Charlie", 35);

        // Retrieve a value
        System.out.println("Alice's age: " + linkedHashMap.get("Alice")); // Output: Alice's age: 30

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a key exists
        if (linkedHashMap.containsKey("Bob")) {
            System.out.println("Bob is in the map.");
        }

        // Remove an entry
        linkedHashMap.remove("Charlie");

        // Size of the map
        System.out.println("Size of the map: " + linkedHashMap.size());
	}

}
//LinkedHashMap maintains insertion order, which means that it iterates in the order that entries were inserted.
//It allows null keys and values.