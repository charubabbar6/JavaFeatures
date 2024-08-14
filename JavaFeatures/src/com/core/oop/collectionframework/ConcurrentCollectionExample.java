package com.core.oop.collectionframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        
        concurrentMap.put("one", 1);
        concurrentMap.put("two", 2);
        concurrentMap.put("three", 3);

        // Accessing the map
        for (Map.Entry<String, Integer> entry : concurrentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

}
//Concurrent collections are part of the java.util.concurrent package and are designed to handle concurrent access 
//more efficiently. They use advanced synchronization techniques and data structures that allow multiple threads to 
//access them concurrently without locking the entire collection.
//e.g. there is 4 segments. and thread t1 is write operation in segment 1, then in case of synchronized,all 4 segments are locked by this thread and other threads have to wait in synchonized collection.

//but on the other hand, in case of conncurrent collection, segemnt 1 is locked for read and write  while all other 3  segemnts are open for other threads. It called lock stripping.
//oncurrent collections, such as ConcurrentHashMap, CopyOnWriteArrayList, and ConcurrentLinkedQueue, are designed to handle concurrent access more efficiently.
//They often use fine-grained locking or lock-free algorithms to allow high levels of concurrency.
//They eliminate the need for explicit synchronization when iterating or performing operations on the collection.

//Concurrent Collections: Part of the java.util.concurrent package, they are optimized for concurrent access and are generally preferred in high-concurrency environments. They offer better performance and scalability.