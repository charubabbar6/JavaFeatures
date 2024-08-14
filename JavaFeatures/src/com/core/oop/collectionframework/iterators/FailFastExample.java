package com.core.oop.collectionframework.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
        	String value = iterator.next();
            System.out.println(value);
         // Concurrent modification
           // list.add("D"); // This will throw ConcurrentModificationException
            // the ArrayList iterator throws a ConcurrentModificationException when the list is modified during iteration.
        }
	}

}
//Fail fast iterators throws concurrent modifiaction exception when one thread is iterating over collection object and 
//other thread structurly modify collection either by adding,removing or modifying objects on underlying collection. They are 
//called fail fast  because they try to immediatly throw exception when they encounter failure.
//
//Fail-fast iterators are designed to detect concurrent modifications to a collection (e.g., structure changes like 
//adding or removing elements) during iteration. If such a modification is detected, they throw a 
//ConcurrentModificationException.
//
//Behavior:
//
//Detection: They immediately throw an exception if the collection is modified while iterating.
//Consistency: Ensures that the iteration reflects the state of the collection at the time the iterator was created.
//Performance: Fail-fast iterators typically offer better performance because they don’t need additional 
//synchronization mechanisms.
//example:ArrayList, HashSet