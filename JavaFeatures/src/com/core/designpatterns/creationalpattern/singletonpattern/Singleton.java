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
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
	}

}
