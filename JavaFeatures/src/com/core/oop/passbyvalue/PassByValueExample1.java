package com.core.oop.passbyvalue;

public class PassByValueExample1 {
	public static void modifyObject(Person p) {
        p.name = "John"; // Modifies the object that p references
    }
	public static void reassignObject(Person p) {
        p = new Person("Doe"); // Reassigns the reference; does not affect the original reference
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Alice");
		System.out.println(person.name);
		modifyObject(person);
		System.out.println("Name after modifyObject: " + person.name); // Outputs: John
		reassignObject(person);
        System.out.println("Name after reassignObject: " + person.name); // Still outputs: John
	}

}


//Java is pass-by-value: All arguments in Java are passed by value, meaning that a 
//copy of the argument's value is passed to the method.

//For primitive types, this means a copy of the actual value is passed, and changes do 
//not affect the original value.

//For object references, a copy of the reference (pointer) to the object is passed. 
//This means the method can modify the object that the reference points to, but reassigning
//the reference does not change the original reference in the caller.