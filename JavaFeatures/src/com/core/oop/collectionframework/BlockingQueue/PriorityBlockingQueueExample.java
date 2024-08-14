package com.core.oop.collectionframework.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a PriorityBlockingQueue
        BlockingQueue<Task> queue = new PriorityBlockingQueue<>();
     // Producer thread
        Thread producer = new Thread(() -> {
            try {
                // Add tasks with different priorities
                queue.put(new Task("Low Priority Task", 3));
                queue.put(new Task("Medium Priority Task", 2));
                queue.put(new Task("High Priority Task", 1));
                queue.put(new Task("Another Low Priority Task", 3));
                
                // Sleep to simulate task production time
                Thread.sleep(1000);

                // Add more tasks
                queue.put(new Task("Urgent Task", 0));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
     // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    // Retrieve and process tasks based on priority
                    Task task = queue.take(); // Blocks if the queue is empty
                    System.out.println("Consuming: " + task);
                    
                    // Sleep to simulate task processing time
                    Thread.sleep(500);
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
//Task class implementing Comparable for priority-based ordering
class Task implements Comparable<Task> {
	private final String name;
    private final int priority; // Lower values indicate higher priority
    
    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

	@Override
	public int compareTo(Task other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.priority, other.priority);
	}
	
	@Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }

}
//PriorityBlockingQueue is a type of BlockingQueue that orders its elements according to their natural ordering or a specified 
//comparator. It is a thread-safe queue that supports concurrent access and can be useful 
//for scenarios where elements need to be processed in a specific order based on priority.
//the producer adds elements to the queue with different priorities, and the consumer 
//processes elements based on their priority.