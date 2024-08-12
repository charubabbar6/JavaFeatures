package com.core.oop.equalshashcodecontract;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MianClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create some Person objects
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);
        
        // Using HashSet to demonstrate `equals` and `hashCode` contracts
        Set<Person> peopleSet = new HashSet<>();
        peopleSet.add(person1);
        peopleSet.add(person2); // This will not be added because person1 and person2 are considered equal
        //peopleSet.add(person3);
        
        System.out.println("HashSet contains:");
        for (Person person : peopleSet) {
            System.out.println(person);
        }
        
        // Using HashMap to demonstrate key-based operations with `equals` and `hashCode`
        Map<Person, String> personMap = new HashMap<>();
        personMap.put(person1, "Engineer");
        personMap.put(person3, "Artist");
        
        System.out.println("\nHashMap contents:");
        for (Map.Entry<Person, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // Check if person2 is a key in the map
        System.out.println("\nIs person2 a key in the map? " + personMap.containsKey(person2));
	}

}


//equals and hashCode Contract
//****************

//*****************
//equals Method Contract

//The equals method must follow these rules:
//
//Reflexive: For any non-null reference value x, x.equals(x) should return true.
//
//Symmetric: For any non-null reference values x and y, x.equals(y) should return true 
//if and only if y.equals(x) returns true.
//
//Transitive: For any non-null reference values x, y, and z, if x.equals(y) returns true
//and y.equals(z) returns true, then x.equals(z) should return true.
//
//Consistent: For any non-null reference values x and y, multiple invocations 
//of x.equals(y) consistently return true or consistently return false, 
//provided no information used in equals comparisons is modified.
//
//Null Comparison: For any non-null reference value x, x.equals(null) should return false.
//
//		hashCode Method Contract
//		The hashCode method must adhere to these rules:
//
//		Consistent: The hash code of an object should remain consistent as long as 
//the object remains unchanged. If the object's data used in equals comparisons does 
//not change, the hashCode method should return the same value.
//
//		Equal Objects Have Equal Hash Codes: If two objects are considered equal 
//according to the equals method, then calling hashCode on each of these objects must 
//produce the same integer result.
//
//		Unequal Objects May Have Unequal Hash Codes: If two objects are not equal 
//according to the equals method, their hash codes do not need to be different, 
//but it’s beneficial for hash-based collections if they are.