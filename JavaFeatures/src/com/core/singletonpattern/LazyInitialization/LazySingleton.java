package com.core.singletonpattern.LazyInitialization;

public class LazySingleton {
	 // The singleton instance is declared but not initialized
    private static LazySingleton instance;
    
 // Private constructor prevents instantiation from other classes
    private LazySingleton() {}
    
 // Public method to provide access to the instance
    public static LazySingleton getInstance() {
        // Create the instance only if it is not already created
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
 // Example method
    public void showMessage() {
        System.out.println("Hello from LazySingleton!");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Access the singleton instance
        LazySingleton singleton = LazySingleton.getInstance();
        LazySingleton singleton1 = LazySingleton.getInstance();
        singleton.showMessage();
        // Check if both references point to the same instance
        System.out.println("instance1 hashCode: " + singleton.hashCode());
        System.out.println("instance2 hashCode: " + singleton1.hashCode());
        System.out.println("Are both instances the same? " + (singleton == singleton1));
	}

}
//In lazy initialization, the singleton instance is created only when it is needed. 
//This approach is not thread-safe by default.