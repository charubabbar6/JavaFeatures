package com.core.oop.collectionframework.BlockingQueue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a DelayQueue
        DelayQueue<DelayedTask> queue = new DelayQueue<>();
     // Producer thread
        Thread producer = new Thread(() -> {
            try {
                // Add tasks with different delays
                queue.put(new DelayedTask("Task 1", 2, TimeUnit.SECONDS));
                queue.put(new DelayedTask("Task 2", 5, TimeUnit.SECONDS));
                queue.put(new DelayedTask("Task 3", 1, TimeUnit.SECONDS));
                queue.put(new DelayedTask("Task 4", 3, TimeUnit.SECONDS));
             // Sleep to simulate task production time
                Thread.sleep(1000); // This can throw InterruptedException
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();// Restore interrupted status
                System.err.println("Producer thread was interrupted");
                
            }
        });
        // Consumer thread
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    DelayedTask task = queue.take(); // Blocks if no tasks are available
                    System.out.println("Consuming: " + task);
                    
                    // Sleep to simulate task processing time
                    Thread.sleep(500);// This can throw InterruptedException
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();// Restore interrupted status
                System.err.println("Main thread was interrupted while waiting for producer");
            }
        });
        
     // Start the threads
        producer.start();
        consumer.start();
     // Wait for the producer thread to complete
        try {
            producer.join();// This can throw InterruptedException
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();// Restore interrupted status
            System.err.println("Main thread was interrupted while waiting for producer");
        }
        
        // Optionally stop the consumer thread (e.g., after a certain condition or timeout)
        // For demo purposes, we'll stop the consumer manually in this example.
        consumer.interrupt(); // Interrupt the consumer thread to stop it gracefully
	}

}
//DelayedTask class implementing Delayed
class DelayedTask implements Delayed {
 private final String name;
 private final long startTime;

 public DelayedTask(String name, long delay, TimeUnit unit) {
     this.name = name;
     this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
 }

 @Override
 public long getDelay(TimeUnit unit) {
     long delayInMillis = startTime - System.currentTimeMillis();
     return unit.convert(delayInMillis, TimeUnit.MILLISECONDS);
 }

 @Override
 public int compareTo(Delayed other) {
     if (this.startTime < ((DelayedTask) other).startTime) {
         return -1;
     }
     if (this.startTime > ((DelayedTask) other).startTime) {
         return 1;
     }
     return 0;
 }

 @Override
 public String toString() {
     return name + " (Delayed until: " + startTime + ")";
 }
}
//The DelayQueue in Java is a type of BlockingQueue that holds elements until they become eligible for processing based on a delay. It is often used for scheduling tasks that need to be executed after a certain delay or at a specific time in the future. Elements in a DelayQueue are implemented using the Delayed interface, which defines the delay period before the element becomes available for removal.
// the producer adds tasks with specific delays to the queue, and the consumer retrieves and processes these tasks once their delay period has elapsed.