package com.core.oop.encapsulation;

public class BankAccount {

	// Private fields
    private String accountNumber;
    private double balance;
 // Constructor
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	 // Getter 
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
    

	
    // Method to deposit money
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
 // Method to withdraw money
	public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
