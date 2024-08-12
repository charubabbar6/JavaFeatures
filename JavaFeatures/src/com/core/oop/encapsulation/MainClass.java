package com.core.oop.encapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a new bank account
        BankAccount myAccount = new BankAccount("123456789", 1000.00);
     // Display initial balance
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        // Deposit money
        myAccount.deposit(500.00);
        System.out.println("Balance after deposit: $" + myAccount.getBalance());

        // Withdraw money
        if (myAccount.withdraw(200.00)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
        System.out.println("Balance after withdrawal: $" + myAccount.getBalance());
//test
	}

}
//Encapsulation/Data Hiding: private Variables and public Methods wrapped as a single unit in class.
//They can be accessed only through objects.
//Advantages of encapsulation:1. by providing getter and setter ,we can make a class raed-only and write only
//2.it provides control over the data.we can write logic in setter and decide what is to be saved or what not.
//3. it is way to achieving data hiding,becoz others class will not be able to access data through the private data members
