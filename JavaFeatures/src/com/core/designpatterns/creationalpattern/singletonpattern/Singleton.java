package com.core.designpatterns.creationalpattern.singletonpattern;


//Ensures that a class has only one instance and provides a global point of access to it.
public class Singleton {
	
	private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    
    public void showMessage() {
        System.out.println("Hello from Singleton!");
        System.out.println("hashcode of singelton object ::"+instance);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();
        
        
        Teacher t1=new Teacher();
        System.out.println(t1);
        Teacher t2=new Teacher();
        System.out.println(t2);
	}

}
//Singleton pattern is one of the simplest design patterns in Java. 
//This pattern involves a single class which is responsible to create an object while 
//making sure that only single object gets created. 

//This class provides a way to access its only object which can be accessed directly 
//without need to instantiate the object of the class. 
