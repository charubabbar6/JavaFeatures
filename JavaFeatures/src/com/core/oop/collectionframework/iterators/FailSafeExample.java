package com.core.oop.collectionframework.iterators;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new ConcurrentHashMap<>();
        map.put("1", "A");
        map.put("2", "B");
        map.put("3", "C");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
        	Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getValue());
         // Concurrent modification
            map.put("4", "D"); // No exception is thrown here
            //ConcurrentHashMap allows modifications while iterating, and no exception is thrown because it uses a fail-safe iterator that operates on a snapshot of the map’s state.
        }
	}

}
//Fail safe iterators doesn't throw any exception if collection is modified structurally while one thread is iterating over it
//because they work on clone of collection instead of original collection and that's why they are called fail safe iterator.
//Fail-safe iterators work on a copy of the collection's data. 
//They do not throw exceptions if the collection is modified during iteration. 
//Instead, they operate on a snapshot of the collection’s state at the time the iterator was created.
//
//Behavior:
//
//Detection: They do not throw ConcurrentModificationException even if the collection is modified during iteration.
//Consistency: The iterator provides a view of the collection as it was when the iterator was created, so modifications 
//after that are not visible.
//Performance: May have performance overhead due to the need to copy or maintain snapshots of the collection.

////example:ConcurrentHashMap, CopyOnWriteArrayList.