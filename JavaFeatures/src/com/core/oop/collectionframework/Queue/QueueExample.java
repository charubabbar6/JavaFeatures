package com.core.oop.collectionframework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();
        
        // Enqueue elements
        queue.offer("Element 1"); // Adds an element to the queue
        queue.offer("Element 2");
        queue.offer("Element 3");
        
        
     // Display the queue
        System.out.println("Queue after adding elements: " + queue);
        
     // Dequeue elements
        String removedElement = queue.poll(); // Retrieves and removes the head of the queue
        System.out.println("Removed element: " + removedElement);

        // Display the queue after removal
        System.out.println("Queue after removing an element: " + queue);
        
     // Peek at the head of the queue without removing it
        String headElement = queue.peek(); // Retrieves but does not remove the head of the queue
        System.out.println("Head element: " + headElement);

        // Display the final state of the queue
        System.out.println("Final state of the queue: " + queue);
	}

}
//he Queue interface in Java represents a collection designed for holding elements prior to processing. The Queue interface provides methods for inserting, removing, and inspecting elements. Various implementations of Queue are available in Java, including PriorityQueue, LinkedList, ArrayDeque, and ConcurrentLinkedQueue.