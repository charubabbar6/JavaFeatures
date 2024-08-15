package com.core.designpatterns.behavioralpattern.command;

//Receiver class
public class Fan {
	public void on() {
        System.out.println("Fan is ON");
    }

    public void off() {
        System.out.println("Fan is OFF");
    }
}
