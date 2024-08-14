package com.core.singletonpattern.ThreadSafeSingleton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	
	 private ThreadSafeSingleton() {}
	 
	 public static synchronized ThreadSafeSingleton getInstance() {
	        if (instance == null) {
	            instance = new ThreadSafeSingleton();
	        }
	        return instance;
	    }
	 public void showMessage() {
	        System.out.println("Hello from ThreadSafeSingleton!");
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Access the singleton instance
        ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
        singleton.showMessage();
	}

}
//To make the lazy initialization approach thread-safe, you can use synchronized blocks or methods.