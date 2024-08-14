package com.core.oop.collectionframework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();
        
        // Add elements
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");
        deque.add("Date");
        
        // Print the Deque elements
        System.out.println("ArrayDeque elements:");
        while (!deque.isEmpty()) {
            System.out.println(deque.poll()); // Retrieves and removes the head of the deque
        }
        
        // Add elements to the Deque at both ends
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addFirst("Cherry");
        deque.addLast("Date");
        
        // Print the Deque elements
        System.out.println("\nArrayDeque elements (after adding):");
        while (!deque.isEmpty()) {
            System.out.println(deque.poll()); // Retrieves and removes the head of the deque
        }
	}

}
//ArrayDeque is a resizable-array implementation of the Deque interface. It is more efficient than LinkedList when used as a stack or queue.