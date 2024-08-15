package com.core.designpatterns.behavioralpattern.command;

//Implement Concrete Commands
//Receiver class
public class Light {
	public void on() {
        System.out.println("Light is ON");
    }

    public void off() {
        System.out.println("Light is OFF");
    }
}
