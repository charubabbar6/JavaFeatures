package com.core.designpatterns.behavioralpattern.ChainOfResponsibility;

//build a system to handle different levels of employee approval for a purchase request.
//Request class
public class PurchaseRequest {
	private double amount;
    private String purpose;
	public PurchaseRequest(double amount, String purpose) {
		super();
		this.amount = amount;
		this.purpose = purpose;
	}
	public double getAmount() {
		return amount;
	}
	public String getPurpose() {
		return purpose;
	}
    
    
}
