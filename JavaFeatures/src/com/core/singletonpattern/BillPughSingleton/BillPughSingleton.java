package com.core.singletonpattern.BillPughSingleton;

public class BillPughSingleton {
	private BillPughSingleton() {}
	// Static inner helper class responsible for holding the singleton instance
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showMessage() {
        System.out.println("Hello from BillPughSingleton!");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Access the singleton instance
        BillPughSingleton singleton = BillPughSingleton.getInstance();
        singleton.showMessage();
	}

}
//This approach uses a static inner helper class to implement the singleton pattern. It is thread-safe and lazy-loaded.