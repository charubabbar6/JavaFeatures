package com.core.oop.collectionframework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        
        // Add elements to both ends
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addFirst("Cherry");
        deque.addLast("Date");
        
        // Print the Deque elements
        System.out.println("ArrayDeque elements (in insertion order):");
        for (String fruit : deque) {
            System.out.println(fruit);
        }
        
        // Remove elements from both ends
        System.out.println("\nRemoving elements:");
        System.out.println("Removed from front: " + deque.pollFirst());
        System.out.println("Removed from end: " + deque.pollLast());
        
        // Print the remaining elements
        System.out.println("\nRemaining ArrayDeque elements:");
        for (String fruit : deque) {
            System.out.println(fruit);
        }
	}

}
