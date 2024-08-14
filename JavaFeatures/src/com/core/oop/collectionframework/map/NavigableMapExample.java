package com.core.oop.collectionframework.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
//NavigableMap extends SortedMap with additional methods for navigation and range views.
public class NavigableMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a TreeMap which implements NavigableMap
        NavigableMap<String, Integer> navigableMap = new TreeMap<>();

        // Add key-value pairs
        navigableMap.put("Alice", 30);
        navigableMap.put("Bob", 25);
        navigableMap.put("Charlie", 35);
        navigableMap.put("David", 20);

        // Retrieve and print the values
        System.out.println("Alice's age: " + navigableMap.get("Alice")); // Output: Alice's age: 30

        // Print all key-value pairs in sorted order of keys
        System.out.println("Entries in sorted order:");
        for (Map.Entry<String, Integer> entry : navigableMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Getting the first and last entries
        System.out.println("First entry: " + navigableMap.firstEntry()); // Output: First entry: David=20
        System.out.println("Last entry: " + navigableMap.lastEntry()); // Output: Last entry: Charlie=35

        // Getting a submap
        NavigableMap<String, Integer> subMap = navigableMap.subMap("Bob", true, "David", false);
        System.out.println("Submap from 'Bob' to 'David':");
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove an entry
        navigableMap.remove("Charlie");

        // Print the map size
        System.out.println("Size of the map after removal: " + navigableMap.size());
	}

}
