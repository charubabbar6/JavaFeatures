package com.core.oop.classimmutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final  class ImmutablePersonList {
	
	 private final List<String> people;
	 
	 public ImmutablePersonList(List<String> people) {
	        // Create a defensive copy of the list to ensure immutability
	        this.people = new ArrayList<>(people);
	    }
	 
	 public List<String> getPeople() {
	        // Return an unmodifiable view of the list
	        return Collections.unmodifiableList(people);
	    }
	 
	 @Override
	    public String toString() {
	        return "ImmutablePersonList{people=" + people + "}";
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> initialPeople = List.of("Alice", "Bob", "Charlie");
		 ImmutablePersonList personList = new ImmutablePersonList(initialPeople);
		// Print details of the person list
	        System.out.println(personList);
	     // Access people via getter
	        System.out.println("People: " + personList.getPeople());
	        
	        // Attempting to modify the list returned by getPeople() will throw an UnsupportedOperationException
	         //personList.getPeople().add("David"); // This would throw an exception
	        //Collections.unmodifiableList() ensures that the list cannot be modified 
	        //after it is exposed through the getter.
	}

}
