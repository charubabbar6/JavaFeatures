package com.core.designpatterns.behavioralpattern.Mediator;

//Implements the Colleague interface and communicates with the mediator.
public class ConcreteColleague2 implements Colleague {
	private Mediator mediator;
	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		 this.mediator = mediator;
	}

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		mediator.send(message, this);
	}

	@Override
	public void receive(String message) {
		// TODO Auto-generated method stub
		System.out.println("Colleague2 received: " + message);
	}

}
