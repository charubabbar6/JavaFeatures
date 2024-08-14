package com.core.singletonpattern.EagerInitialization;

public class EagerSingleton {
	// The single instance of the class is created at class loading time
    private static final EagerSingleton instance = new EagerSingleton();
    
 // Private constructor prevents instantiation from other classes
    private EagerSingleton() {}
    
 // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
    
 // Example method
    public void showMessage() {
        System.out.println("Hello from EagerSingleton!");
    }
    
	public static void main(String[] args) {
		 // Access the singleton instance
        EagerSingleton instance1 = EagerSingleton.getInstance();
        instance1.showMessage();
        EagerSingleton instance2 = EagerSingleton.getInstance();
     // Check if both references point to the same instance
        System.out.println("instance1 hashCode: " + instance1.hashCode());
        System.out.println("instance2 hashCode: " + instance2.hashCode());
        System.out.println("Are both instances the same? " + (instance1 == instance2));
   
	}
}
//In eager initialization, the instance of the singleton class is created at the time of class loading.