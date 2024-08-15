package com.core.designpatterns.behavioralpattern.ChainOfResponsibility;

public class Director extends Approver {

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		 if (request.getAmount() <= 5000) {
	            System.out.println("Director approves purchase request of amount: " + request.getAmount());
	        } else if (nextApprover != null) {
	            nextApprover.processRequest(request);
	        }
	}

}
