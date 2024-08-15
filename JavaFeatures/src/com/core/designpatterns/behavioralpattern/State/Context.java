package com.core.designpatterns.behavioralpattern.State;

//Context Class
//The class that has a state and changes its behavior based on the state.
public class Context {
	private State state;

    public Context() {
        // Default state
        this.state = new RedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest(this);
    }
}
