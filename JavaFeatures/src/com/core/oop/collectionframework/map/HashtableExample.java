package com.core.oop.collectionframework.map;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Add key-value pairs
        hashtable.put("Alice", 30);
        hashtable.put("Bob", 25);
        hashtable.put("Charlie", 35);
        hashtable.put("David", 20);

        // Retrieve and print a value
        System.out.println("Alice's age: " + hashtable.get("Alice")); 
        
     // Print all key-value pairs
        System.out.println("Entries in the hashtable:");
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            Integer value = hashtable.get(key);
            System.out.println(key + ": " + value);
        }

        // Check if a key exists
        if (hashtable.containsKey("Bob")) {
            System.out.println("Bob is in the hashtable.");
        }

        // Remove an entry
        hashtable.remove("Charlie");

        // Print the map size
        System.out.println("Size of the hashtable after removal: " + hashtable.size());

        // Attempting to put null keys or values will throw NullPointerException
        try {
            hashtable.put(null, 40); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Cannot insert null key.");
        }
        
        try {
            hashtable.put("Eve", null); // Throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Cannot insert null value.");
        }
	}

}
//Hashtable is a legacy class in Java that implements the Map interface. It is synchronized, 
//meaning that it is thread-safe and can be used safely in multi-threaded environments. 
//However, it is generally considered less efficient than HashMap due to its synchronization overhead. 
//For modern applications, HashMap is preferred unless synchronization is a requirement.

//Key Points About Hashtable
//Thread Safety: Hashtable is synchronized, making it thread-safe. This means multiple threads can access it 
//concurrently without corrupting the data.

//Null Keys and Values: Hashtable does not allow null keys or null values. Attempting to insert a null key or 
//value will result in a NullPointerException.

//Legacy Class: Hashtable is part of the original Java 1.0 and has been largely replaced by HashMap, 
//which offers similar functionality but with better performance due to lack of synchronization overhead.

//Enumeration: Hashtable uses Enumeration for iterating over keys and values, which is an older interface. 
//Modern alternatives like HashMap use Iterator, which provides more functionality.

//Synchronization Overhead: The synchronization provided by Hashtable can be costly in terms of performance. 
//If thread safety is required and you want better performance, consider using ConcurrentHashMap 
//from the java.util.concurrent package.

//Hashtable is a synchronized map implementation that provides thread safety but does not allow null keys or values.
//It is less efficient compared to HashMap due to synchronization overhead.
//For modern applications, prefer HashMap or ConcurrentHashMap for better performance and more features.