package com.core.designpatterns.behavioralpattern.Strategy;

//The Strategy pattern involves defining a family of algorithms and making them interchangeable 
//within the context of a specific client. This pattern is particularly useful when you need to
//switch between algorithms dynamically.
public class StrategyPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a shopping cart
        //ShoppingCart cart = new ShoppingCart();
		// Using CreditCardPayment strategy
		ShoppingCart cart;
        cart = new ShoppingCart(new CreditCardPayment("John Doe", "1234-5678-9876-5432"));
     // Set payment strategy to Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(100);
        
        // Change payment strategy to PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(200);
        
     // Changing to BankTransferPayment strategy
        cart.setPaymentStrategy(new BankTransferPayment("DE12345678901234567890"));
        cart.checkout(250);
	}

}
// Strategy pattern can be used to switch between different payment methods at runtime, demonstrating 
//flexibility and separation of concerns.