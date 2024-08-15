package com.core.designpatterns.behavioralpattern.Strategy;

//Context class
public class ShoppingCart {
	private PaymentStrategy paymentStrategy;
	
	public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void checkout(int amount) {
		 if (paymentStrategy == null) {
	            throw new IllegalStateException("Payment strategy not set!");
	        }
		 paymentStrategy.pay(amount);
	}
//	
//	 public void executePayment(int amount) {
//	        paymentStrategy.pay(amount);
//	    }
}
