package com.core.oop.collectionframework.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
//SortedMap provides basic sorted map functionality.
public class SortedMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a TreeMap which implements SortedMap
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        // Add key-value pairs
        sortedMap.put("Alice", 30);
        sortedMap.put("Bob", 25);
        sortedMap.put("Charlie", 35);
        sortedMap.put("David", 20);

        // Retrieve and print the values
        System.out.println("Alice's age: " + sortedMap.get("Alice")); // Output: Alice's age: 30

        // Print all key-value pairs in sorted order of keys
        System.out.println("Entries in sorted order:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Getting the first and last keys
        System.out.println("First entry: " + sortedMap.firstKey()); // Output: First key: David
        System.out.println("Last entry: " + sortedMap.lastKey()); // Output: Last key: Charlie

        // Getting a submap
        SortedMap<String, Integer> subMap = sortedMap.subMap("Bob", "David");
        System.out.println("Submap from 'Bob' to 'David':");
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
     // Getting headMap and tailMap
        SortedMap<String, Integer> headMap = sortedMap.headMap("Charlie");
        SortedMap<String, Integer> tailMap = sortedMap.tailMap("Bob");
        
        System.out.println("Head map (keys before 'Charlie'):");
        for (Map.Entry<String, Integer> entry : headMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        System.out.println("Tail map (keys from 'Bob' onwards):");
        for (Map.Entry<String, Integer> entry : tailMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Remove an entry
        sortedMap.remove("Charlie");

        // Print the map size
        System.out.println("Size of the map after removal: " + sortedMap.size());
	}

}
//The SortedMap interface in Java is a specialized version of the Map interface that maintains its keys in a sorted order.
//The primary implementation of SortedMap is the TreeMap, which keeps keys sorted according to their natural 
//order or a specified comparator.