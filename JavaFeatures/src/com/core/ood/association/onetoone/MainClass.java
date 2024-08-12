package com.core.ood.association.onetoone;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Passport object
        Passport myPassport = new Passport();
        myPassport.setPassportNumber("123456789");
     // Create a Person object
        Person person = new Person();
        person.setPassport(myPassport);
     // Retrieve and display passport information from the Person object
        System.out.println("Person's Passport Number: " + person.getPassport().getPassportNumber());
 
	}

}
