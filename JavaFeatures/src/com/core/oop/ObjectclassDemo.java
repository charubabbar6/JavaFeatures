package com.core.oop;

import java.util.Objects;

public class ObjectclassDemo {
	private String name;
    private int age;

    public ObjectclassDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
 // Override toString() to provide a custom string representation
	@Override
	public String toString() {
		return "ObjectclassDemo [name=" + name + ", age=" + age + "]";
	}
	
	// Override hashCode() to be consistent with equals()
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	// Override equals() to compare Person objects by their fields
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectclassDemo other = (ObjectclassDemo) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	// Override clone() to create a copy of the Person object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new ObjectclassDemo(this.name, this.age);
    }
    
 // Override finalize() to perform cleanup before the object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        try {
            // Clean up resources or perform actions before the object is destroyed
            System.out.println("Finalizing Person: " + this);
        } finally {
            // Ensure the superclass finalize() method is called
            super.finalize();
        }
    }
    
 // Use getClass() to obtain the runtime class of the object
    public void printClassName() {
        // This will print the name of the class of the current object
        System.out.println("The class name is: " + this.getClass().getName());
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ObjectclassDemo person1 = new ObjectclassDemo("Alice", 30);
		ObjectclassDemo person2 = new ObjectclassDemo("Alice", 30);
		ObjectclassDemo person3 = new ObjectclassDemo("Bob", 25);
		
		 // toString() demo
        System.out.println("person1: " + person1);
        
     // equals() and hashCode() demo
        System.out.println("person1 equals person2: " + person1.equals(person2)); // true
        System.out.println("person1 equals person3: " + person1.equals(person3)); // false
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
	

	// clone() demo
    try {
    	ObjectclassDemo clonedPerson = (ObjectclassDemo) person1.clone();
        System.out.println("Cloned person: " + clonedPerson);
    } catch (CloneNotSupportedException e) {
        e.printStackTrace();
    }
 // finalize() demo
    // Note: finalize() is not guaranteed to be called immediately.
    // This call is just to show its usage.
    person1 = null;
    System.gc(); // Request garbage collection

    // getClass() demo
    person2.printClassName();
    

}
}
//Java.lang.Object class, parent of all has following methods : 