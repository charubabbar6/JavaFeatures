package com.core.designpatterns.behavioralpattern.Strategy;

public class BankTransferPayment implements PaymentStrategy {
	private String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }
	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Paying " + amount + " using Bank Transfer.");
        System.out.println("Bank Account: " + bankAccount);
	}

}
