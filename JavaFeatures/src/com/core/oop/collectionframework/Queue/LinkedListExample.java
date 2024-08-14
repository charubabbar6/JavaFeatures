package com.core.oop.collectionframework.Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedList as a Queue
        Queue<String> queue = new LinkedList<>();
     // Add elements
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Date");
        
        // Print the Queue elements
        System.out.println("Queue elements:");
        //System.out.println(queue);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Retrieves and removes the head of the queue
        }
        
     // Create a LinkedList as a Deque
        Deque<String> deque = new LinkedList<>();
     // Add elements to the Deque
        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addFirst("Cherry");
        deque.addLast("Date");
        
        // Print the Deque elements (elements will be in insertion order)
        System.out.println("\nDeque elements:");
        while (!deque.isEmpty()) {
            System.out.println(deque.pollFirst()); // Retrieves and removes the first element
        }
	}

}
//LinkedList is a doubly-linked list implementation of the Queue and Deque interfaces. It supports insertion, removal, and traversal operations from both ends of the list.