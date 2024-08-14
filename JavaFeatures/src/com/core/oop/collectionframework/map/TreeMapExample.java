package com.core.oop.collectionframework.map;

import java.util.Map;
import java.util.TreeMap;
//TreeMap: Sorted by keys. Does not allow null keys but allows null values.
//TreeMap implements NavigableMap and provides methods like firstEntry() and lastEntry().
public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a TreeMap
        Map<String, Integer> treeMap = new TreeMap<>();

        // Add key-value pairs
        treeMap.put("Alice", 30);
        treeMap.put("Bob", 25);
        treeMap.put("Charlie", 35);

        // Retrieve a value
        System.out.println("Alice's age: " + treeMap.get("Alice")); // Output: Alice's age: 30

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if a key exists
        if (treeMap.containsKey("Bob")) {
            System.out.println("Bob is in the map.");
        }

        // Remove an entry
        treeMap.remove("Charlie");

        // Size of the map
        System.out.println("Size of the map: " + treeMap.size());
	}

}
//TreeMap implements the SortedMap interface and sorts the keys in natural order or by a specified comparator. 
//It does not allow null keys but allows null values.