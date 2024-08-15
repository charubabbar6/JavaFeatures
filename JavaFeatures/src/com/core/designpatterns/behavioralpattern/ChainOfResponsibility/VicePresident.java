package com.core.designpatterns.behavioralpattern.ChainOfResponsibility;

public class VicePresident extends Approver {

	@Override
	public void processRequest(PurchaseRequest request) {
		// TODO Auto-generated method stub
		if (request.getAmount() <= 10000) {
            System.out.println("VicePresident approves purchase request of amount: " + request.getAmount());
//        } else if (nextApprover != null) {
//            nextApprover.processRequest(request);
//        }
		}else {
            System.out.println("Purchase request of amount " + request.getAmount() + " requires higher approval.");
        }
	}

}
