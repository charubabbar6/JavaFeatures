package com.core.designpatterns.behavioralpattern.Strategy;

//Concrete Strategy 1
public class CreditCardPayment implements PaymentStrategy {
	
	private String cardNumber;
	 private String name;
	
	
	public CreditCardPayment(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CreditCardPayment(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Paying " + amount + " using Credit Card: " + cardNumber);
	}

}
