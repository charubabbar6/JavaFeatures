package com.core.oop.equalshashcodecontract;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("charu");
		Employee emp2 = new Employee();
		emp2.setId(1);
		emp2.setName("charu");
		System.out.println("Shallow Comparison::"+(emp1==emp2) );
		System.out.println("Deep Comparison::"+(emp1.equals(emp2)) );
	}

}
//1. If two objects are equal according to equals(Object o) method then the hash code for both the object must be same(integer value).
//2. Its not necessary that if you have same hash code for 2 objects means those two object are equal.This is collision.better hash function prevent this.
//3. whenever it is invoked on the same object more than once during an execution of a java application ,the hashcode method must consistently return the same integer.