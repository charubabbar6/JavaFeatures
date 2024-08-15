package com.core.designpatterns.behavioralpattern.State;

public class GreenState implements State {

	@Override
	public void handleRequest(Context context) {
		// TODO Auto-generated method stub
		 System.out.println("Traffic light is green. You can go.");
	        context.setState(new YellowState()); // Move to next state
	}

}
