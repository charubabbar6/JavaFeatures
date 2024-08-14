package com.core.singletonpattern.DoubleCheckedLockingSingleton;

public class DoubleCheckedLockingSingleton {
	
	 private static volatile DoubleCheckedLockingSingleton instance;
	 
	 private DoubleCheckedLockingSingleton() {}

	    public static DoubleCheckedLockingSingleton getInstance() {
	        if (instance == null) {
	            synchronized (DoubleCheckedLockingSingleton.class) {
	                if (instance == null) {
	                    instance = new DoubleCheckedLockingSingleton();
	                }
	            }
	        }
	        return instance;
	    }

	    public void showMessage() {
	        System.out.println("Hello from DoubleCheckedLockingSingleton!");
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Access the singleton instance
        DoubleCheckedLockingSingleton singleton = DoubleCheckedLockingSingleton.getInstance();
        singleton.showMessage();
	}

}
//This approach reduces the overhead of acquiring a lock by first checking the instance without synchronization and 
//then using synchronized block if the instance is null.