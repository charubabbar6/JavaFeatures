package com.core.designpatterns.behavioralpattern.Mediator;

// Defines the interface for communication between components.
public interface Mediator {
	void send(String message, Colleague colleague);
}
