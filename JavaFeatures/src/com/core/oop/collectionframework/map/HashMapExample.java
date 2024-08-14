package com.core.oop.collectionframework.map;

import java.util.HashMap;
import java.util.Map;
//HashMap is the most commonly used implementation of the Map interface. 
//It allows null values and one null key. It does not guarantee any specific order of its elements.
//HashMap: Fast and does not guarantee order. Allows one null key and multiple null values.
public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a HashMap
        Map<String, Integer> map = new HashMap<>();
     // Adding entries
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);
        
     // Retrieving a value
        System.out.println("Alice's age: " + map.get("Alice"));
        
        // Iterating over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
     // Checking if a key exists
        if (map.containsKey("Bob")) {
            System.out.println("Bob is in the map.");
        }

        // Removing an entry
        map.remove("Charlie");

        // Size of the map
        System.out.println("Size of the map: " + map.size());
	}

}
//HashMap in java works on hashing principle,where hash functions are used to 
//link key and value in HashMap,Objects(Map.Entry-> contains both key and value object)
//are stored by calling put(key,value) method of HashMap and retrieved by calling 
//get(key) method.

//when we call put method, hashcode() method of the key object is called which calculates
//an index of the bucket location where we can store the value object.

//to retrive, we call the get() method and again pass the key object, which lands upon 
//same index or bucket and we can retrive the value object

//if two different keys return same hash index then collision occurs .in this case,a
//linked list is formed at that bucket location and new entry is stored as next node.

//now put method will just append the object nodes in the linked list.

//but in case of get,if we have a linked list at that index then we need an extra check to 
//seacrh correct value,this is done by equals() method. It checks every key of every node and if
//equals() return true,then Map return that corresponding value from the linked list.

//Since Java 8, once a threshold limit is reached for the number of linked list elements added at a particular node, 
//the linked list is re-ordered to a binary tree to implement faster search for collision cases.

//The HashMap class in Java is a widely used implementation of the Map interface that stores key-value pairs. It provides efficient performance for common operations like insertion, deletion, and lookup. Understanding its internal workings can help in leveraging its features effectively and avoiding common pitfalls.
//
//Internal Working of HashMap:
//1. Buckets and Hashing:

//HashMap uses an array of buckets to store the entries. Each bucket is a list (or a linked list, or a tree, in some cases) of entries that hash to the same index.
//When you insert a key-value pair into a HashMap, the key's hash code is computed using the hashCode() method.
//This hash code is then used to determine the bucket index using the formula:

//index = hashCode() & (array.length - 1)
//This ensures that the bucket index is within the bounds of the array.

//2.Handling Collisions:

//Hash Collisions: If multiple keys hash to the same bucket index, they are stored in a linked list (or a balanced tree in some cases). This is known as a collision.
//Treeification: When a bucket becomes too large (by default, more than 8 entries), the linked list is transformed into a balanced tree (a red-black tree) 
//to improve performance for search operations.

//3. Resizing:

//Load Factor: The HashMap has a load factor (default 0.75), which is the ratio of the number of entries to the number of buckets. 
//When the number of entries exceeds this threshold, the HashMap is resized.
//Rehashing: During resizing, a new array of buckets is created, and all existing entries are rehashed and redistributed among the new buckets. 
//This helps to maintain efficient performance.

//Hash Function: The hash function for the keys is crucial for the performance of HashMap. It should evenly distribute keys across the buckets.
//Load Factor and Resizing: The default load factor of 0.75 strikes a balance between time and space cost. The resizing operation, which involves rehashing, 
//can be expensive but is necessary to maintain performance.
//Null Keys and Values: HashMap allows one null key and multiple null values, but be cautious with null values as they can sometimes lead to unexpected behavior.
