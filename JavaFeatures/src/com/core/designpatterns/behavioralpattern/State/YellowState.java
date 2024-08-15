package com.core.designpatterns.behavioralpattern.State;

public class YellowState implements State {

	@Override
	public void handleRequest(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Traffic light is yellow. Prepare to stop.");
        context.setState(new RedState()); // Move to next state
	}

}
