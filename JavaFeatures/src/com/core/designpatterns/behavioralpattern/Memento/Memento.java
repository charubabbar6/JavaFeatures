package com.core.designpatterns.behavioralpattern.Memento;

// Stores the internal state of the TextEditor.
//Memento Class
public class Memento {
	private final String state;

	public Memento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
	
	
	
}
