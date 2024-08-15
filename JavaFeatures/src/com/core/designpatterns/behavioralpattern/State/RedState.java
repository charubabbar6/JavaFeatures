package com.core.designpatterns.behavioralpattern.State;

//ConcreteStates
//Implementations of the State interface, representing different states.
public class RedState implements State {

	@Override
	public void handleRequest(Context context) {
		// TODO Auto-generated method stub
		 System.out.println("Traffic light is red. Please stop.");
	        context.setState(new GreenState()); // Move to next state
	}

}
