package com.core.oop.collectionframework.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        
        // Add elements
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Cherry");
        priorityQueue.add("Date");
        
     // Print the PriorityQueue (elements will be ordered by their natural ordering)
        System.out.println("PriorityQueue elements:");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll()); // Retrieves and removes the head of the queue
        }
	}

}
//PriorityQueue is an implementation of the Queue interface that orders elements according to their natural ordering or by a provided comparator. Elements are retrieved in priority order, not insertion order.