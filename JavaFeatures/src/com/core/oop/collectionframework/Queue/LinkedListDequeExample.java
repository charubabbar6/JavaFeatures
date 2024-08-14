package com.core.oop.collectionframework.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList as a Deque
        Deque<String> deque = new LinkedList<>();
        
        // Add elements to both ends
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addFirst("Cherry");
        deque.addLast("Date");
        
        // Print the Deque elements
        System.out.println("LinkedList elements (in insertion order):");
        for (String fruit : deque) {
            System.out.println(fruit);
        }
        
        // Remove elements from both ends
        System.out.println("\nRemoving elements:");
        System.out.println("Removed from front: " + deque.pollFirst());
        System.out.println("Removed from end: " + deque.pollLast());
        
        // Print the remaining elements
        System.out.println("\nRemaining LinkedList elements:");
        for (String fruit : deque) {
            System.out.println(fruit);
        }
	}

}
