package com.core.designpatterns.behavioralpattern.Mediator;

//Defines an interface for components that can interact with the mediator.
public interface Colleague {
	 void setMediator(Mediator mediator);
	    void send(String message);
	    void receive(String message);
}
