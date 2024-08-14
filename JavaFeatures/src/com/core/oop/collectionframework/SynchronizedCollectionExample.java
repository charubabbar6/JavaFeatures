package com.core.oop.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());
		synchronizedList.add(1);
        synchronizedList.add(2);
        synchronizedList.add(3);

        // Accessing the list
        
        synchronized (synchronizedList) {
        for (Integer i : synchronizedList) {
            System.out.println(i);
        }
        }
	}

}
//Synchronized collections and concurrent collections are both used in Java to handle situations where multiple threads access a collection concurrently. 
//However, they differ in their approach and performance characteristics,scalability and how they achieve thread safety.
//Synchronized collections are traditional Java collections that are synchronized to ensure thread safety. 
//This means that only one thread can access a synchronized collection at a time for a particular operation, 
//preventing concurrent modification issues. 
//You can create synchronized versions of existing collections by using the Collections.
//synchronizedList, Collections.synchronizedSet, or Collections.synchronizedMap methods.
//Synchronization is applied at the method level, so you need to manually synchronize on the collection when iterating over it.
//This can lead to performance bottlenecks if multiple threads access the collection frequently.
//synchronized collections like synchronizedMap are much slower than their concurrent counterparts e.g. ConcurrentHashMap, main reason  for this slowness is locking.

//e.g. there is 4 segments. and thread t1 is write operation in segment 1, then in case of synchronized,all 4 segments are locked by this thread and other threads have to wait in synchonized collection.

//but on the other hand, in case of conncurrent collection, segemnt 1 is locked for read and write  while all other 3  segemnts are open for other threads. It called lock stripping.

//Synchronized Collections: Use Collections.synchronizedList or similar methods to wrap existing collections, but require explicit synchronization when iterating. Suitable for simpler scenarios where thread safety is needed but performance isn't critical.
