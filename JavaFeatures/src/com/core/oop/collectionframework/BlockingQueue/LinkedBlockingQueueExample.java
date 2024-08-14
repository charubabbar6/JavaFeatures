package com.core.oop.collectionframework.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a LinkedBlockingQueue with a capacity of 5
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(5);
        // Producer thread
        Thread producer = new Thread(() -> {
            try {
                String[] items = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig"};
                for (String item : items) {
                    System.out.println("Producing: " + item);
                    queue.put(item); // Blocks if the queue is full
                    Thread.sleep(500); // Simulate time taken to produce an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
     // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    String item = queue.take(); // Blocks if the queue is empty
                    System.out.println("Consuming: " + item);
                    Thread.sleep(1000); // Simulate time taken to consume an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
     // Start the threads
        producer.start();
        consumer.start();
        
        // Wait for the producer thread to complete
        try {
            producer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
     // Optionally stop the consumer thread (e.g., after a certain condition or timeout)
        // For demo purposes, we'll stop the consumer manually in this example.
        consumer.interrupt(); // Interrupt the consumer thread to stop it gracefully
	}

}
//The LinkedBlockingQueue is a common implementation of the BlockingQueue interface that 
//uses a linked node structure. It is a thread-safe queue with optional capacity bounds. 
//If a capacity is not specified, it is effectively unbounded, meaning it can grow as needed.

//Here’s a simple example demonstrating how to use LinkedBlockingQueue with producer and
//consumer threads. The producer thread adds elements to the queue, and the consumer thread 
//retrieves and processes elements from the queue.