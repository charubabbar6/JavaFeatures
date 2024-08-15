package com.core.designpatterns.behavioralpattern.State;

//The State design pattern allows an object to alter its behavior when its 
//internal state changes. The object will appear to change its class. 
//This pattern is particularly useful for implementing state machines 
//where an object can have different states and behaviors.

public class StatePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context context = new Context();
		
		
		// Cycle through the states
        context.request(); // Traffic light is red. Please stop.
        context.request(); // Traffic light is green. You can go.
        context.request(); // Traffic light is yellow. Prepare to stop.
        context.request(); // Traffic light is red. Please stop.
	}

}
//e.g. a simple Context class representing a traffic light with different states: Red, Green, and Yellow.
//Demonstrates how the Context changes state. Each call to context.request() invokes the behavior of the 
//current state and transitions to the next state.