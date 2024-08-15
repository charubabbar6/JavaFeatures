package com.core.designpatterns.behavioralpattern.Strategy;

//Concrete Strategy 2
public class PayPalPayment implements PaymentStrategy {
	private String email;
	
	
	public PayPalPayment(String email) {
		super();
		this.email = email;
	}


	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Paying " + amount + " using PayPal account: " + email);
	}

}
