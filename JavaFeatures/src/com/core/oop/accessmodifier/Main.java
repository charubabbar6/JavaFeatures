package com.core.oop.accessmodifier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Accessing members of the PublicClass
        PublicClass publicClass = new PublicClass();
        System.out.println("PublicClass publicField: " + publicClass.publicField);
        publicClass.publicMethod();
        
        // Accessing members of the DefaultClass
        DefaultClass defaultClass = new DefaultClass();
        System.out.println("DefaultClass defaultField: " + defaultClass.defaultField);
        defaultClass.defaultMethod();
        
     // Accessing members of the Parent class and its nested class
        Parent parent = new Parent();
        System.out.println("Parent protectedField: " + parent.protectedField);
        parent.protectedMethod();
        
     // Trying to access privateField from Parent class (will not work)
        // System.out.println("Parent privateField: " + parent.privateField); // Error
        
        // Accessing nested static and inner classes
        Parent.NestedStaticClass nestedStaticClass = new Parent.NestedStaticClass();
        nestedStaticClass.accessOuterClassFields(); // Shows access to protected and default fields through accessor
        
        Parent.InnerClass innerClass = parent.new InnerClass();
        innerClass.accessOuterClassFields(); // Shows access to all fields including private
	}

}
//Access Modifier|	Class|	Package	|Subclass	|World
//public	       |Yes	     |Yes	    |Yes	    |Yes
//protected      |Yes	     |Yes		|Yes		|No
//default		   |Yes		 |Yes	    |No			|No
//private		   |Yes		 |No	    |No			|No