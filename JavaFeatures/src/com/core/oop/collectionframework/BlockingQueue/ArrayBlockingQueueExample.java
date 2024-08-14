package com.core.oop.collectionframework.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an ArrayBlockingQueue with capacity of 3
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        // Producer thread
        Thread producer = new Thread(() -> {
        	try {
        		 String[] items = {"Apple", "Banana", "Cherry", "Date"};
        		  for (String item : items) {
        			  System.out.println("Producing: " + item);
        			  queue.put(item); // Blocks if the queue is full
        			  Thread.sleep(1000); // Simulate time taken to produce an item
        		  }
        	}catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
     // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                for (int i = 0; i < 4; i++) {
                    String item = queue.take(); // Blocks if the queue is empty
                    System.out.println("Consuming: " + item);
                    Thread.sleep(1500); // Simulate time taken to consume an item
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        
     // Start the threads
        producer.start();
        consumer.start();

        // Wait for threads to complete
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
	}

}
//BlockingQueue interface,"java.util.concurrent.BloclingQueue",represents queue which is 
//thread safe to put elements into ,and take elements out of frpm .In other words, multiple 
//threads can be inserting and taking elements concurrently from a java BlockingQueue,without 
//any concurrency issues arising.

//Its capable of blocking the threads that try to insert or take elemnts from the queue.
//For instance,if a thread tries to take an element, and there are none left in the queue, the
//thread can be blocked until there is an element to take.

//A BlockingQueue in Java is a type of queue that supports operations that wait for the queue
//to become non-empty when retrieving an element and wait for space to become available when 
//storing an element. This is particularly useful in concurrent programming where you need 
//to coordinate the actions of multiple threads.
//
//The BlockingQueue interface extends the Queue interface and includes additional methods for
//thread-safe operations, such as waiting for space to become available or waiting for 
//elements to be available.

//ArrayBlockingQueue is a bounded blocking queue backed by an array. 
//It blocks when the queue is full and the put() method is called, 
//and it blocks when the queue is empty and the take() method is called.

//Here are some common implementations of BlockingQueue:
//
//ArrayBlockingQueue
//LinkedBlockingQueue
//PriorityBlockingQueue
//DelayQueue
//SynchronousQueue