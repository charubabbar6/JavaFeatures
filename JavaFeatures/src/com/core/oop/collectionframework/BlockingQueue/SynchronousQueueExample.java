package com.core.oop.collectionframework.BlockingQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a SynchronousQueue
        SynchronousQueue<String> queue = new SynchronousQueue<>();
        
     // Create a fixed thread pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        
     // Producer task
        Runnable producerTask = () -> {
            try {
                String[] tasks = {"Task 1", "Task 2", "Task 3", "Task 4"};
                for (String task : tasks) {
                    System.out.println("Producing: " + task);
                    queue.put(task); // Blocks if there is no consumer to take the task
                    Thread.sleep(500); // Simulate time taken to produce a task
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Producer was interrupted");
            }
        };

        // Consumer task
        Runnable consumerTask = () -> {
            try {
                while (true) {
                    String task = queue.take(); // Blocks if no tasks are available
                    System.out.println("Consuming: " + task);
                    Thread.sleep(1000); // Simulate time taken to consume a task
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer was interrupted");
            }
        };
        
     // Submit producer and consumer tasks to the executor
        executor.submit(producerTask);
        executor.submit(consumerTask);
        
     // Shutdown executor gracefully after a delay
        try {
            Thread.sleep(5000); // Let the producer and consumer run for some time
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        executor.shutdownNow(); // Interrupt the threads and shutdown the executor
	}

}
//The SynchronousQueue is a special kind of BlockingQueue that does not store elements. Instead, each put() operation must wait for a corresponding take() operation by another thread, and vice versa. This means that a SynchronousQueue acts as a direct handoff mechanism between producer and consumer threads.
//No Internal Storage: It doesn’t hold any elements internally.
//Blocking Operations: The put() method blocks until a consumer thread takes the element, and the take() method blocks until a producer thread puts an element.
//Useful for Hand-off Scenarios: Ideal for situations where tasks are passed directly from producers to consumers without intermediate storage.
