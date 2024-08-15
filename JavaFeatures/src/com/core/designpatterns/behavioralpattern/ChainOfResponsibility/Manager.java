package com.core.designpatterns.behavioralpattern.ChainOfResponsibility;

//Concrete handler for lower-level approvals
public class Manager extends Approver{

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		 if (request.getAmount() <= 1000) {
	            System.out.println("Manager approves purchase request of amount: " + request.getAmount());
	        } else if (nextApprover != null) {
	            nextApprover.processRequest(request);
	        }
	}

}
