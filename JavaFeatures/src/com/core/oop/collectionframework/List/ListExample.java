package com.core.oop.collectionframework.List;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayList
        List<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Print the list
        System.out.println("Original List: " + fruits);

        // Access elements by index
        String firstFruit = fruits.get(0); // Index starts from 0
        System.out.println("First fruit: " + firstFruit);

        // Modify an element
        fruits.set(1, "Blueberry"); // Replace "Banana" with "Blueberry"
        System.out.println("List after modification: " + fruits);

        // Remove an element
        fruits.remove("Cherry"); // Remove the element "Cherry"
        System.out.println("List after removal: " + fruits);

        // Check if the list contains a specific element
        boolean containsApple = fruits.contains("Apple");
        System.out.println("List contains Apple: " + containsApple);

        // Iterate over the list
        System.out.println("Iterating over the List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Get the size of the list
        int size = fruits.size();
        System.out.println("Size of the List: " + size);

        // Clear the list
        fruits.clear();
        System.out.println("List after clearing: " + fruits);
	}

}
