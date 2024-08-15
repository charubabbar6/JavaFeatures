package com.core.designpatterns.behavioralpattern.ChainOfResponsibility;

//The Chain of Responsibility pattern is a behavioral design pattern that
//allows an object to pass a request along a chain of handlers. 
//Each handler in the chain either processes the request or passes it along to the 
//next handler in the chain. This pattern decouples the sender of a request from its receivers, 
//giving multiple objects a chance to handle the request.
public class ChainOfResponsibilityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create handlers
        Approver manager = new Manager();
        Approver director = new Director();
        Approver vicePresident = new VicePresident();
        
     // Set up the chain
        manager.setNextApprover(director);
        director.setNextApprover(vicePresident);
        
     // Create purchase requests
        PurchaseRequest request1 = new PurchaseRequest(500, "Office Supplies");
        PurchaseRequest request2 = new PurchaseRequest(3000, "New Computer");
        PurchaseRequest request3 = new PurchaseRequest(7000, "Company Retreat");
        PurchaseRequest request4 = new PurchaseRequest(15000, "New Office Building");
        
        // Process requests
     // Process requests
        System.out.println("Processing request 1:");
        manager.processRequest(request1);  // Manager approves
        System.out.println("\nProcessing request 2:");
        manager.processRequest(request2);  // Director approves
        System.out.println("\nProcessing request 3:");
        manager.processRequest(request3);  // Vice President approves
        System.out.println("\nProcessing request 4:");
        manager.processRequest(request4);  // Requires higher approval
	}

}
//build a system to handle different levels of employee approval for a purchase request.