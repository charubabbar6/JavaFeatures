package com.core.designpatterns.behavioralpattern.command;

//The Command pattern is a behavioral design pattern that encapsulates 
//a request as an object, thereby allowing for parameterization of clients
//with different requests, queuing of requests, and logging of the requests. 
//It also provides support for undoable operations.
public class CommandPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create receiver objects
        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        // Create command objects
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanOn = new FanOnCommand(ceilingFan);
        Command fanOff = new FanOffCommand(ceilingFan);

        // Create invoker
        RemoteControl remote = new RemoteControl();

        // Set command to turn on the light and press the button
        remote.setCommand(lightOn);
        remote.pressButton();  // Output: Light is ON

        // Set command to turn off the light and press the button
        remote.setCommand(lightOff);
        remote.pressButton();  // Output: Light is OFF
        
     // Undo the last command (turn on the light)
        remote.pressUndo();  

        // Set command to turn on the fan and press the button
        remote.setCommand(fanOn);
        remote.pressButton();  // Output: Fan is ON

        // Set command to turn off the fan and press the button
        remote.setCommand(fanOff);
        remote.pressButton();  // Output: Fan is OFF

        // Test undo functionality
        remote.pressUndo();    // Output: Fan is ON
        
	}

}
//Command Interface: Declares an interface for executing operations.
//Concrete Commands: Implements the command interface and defines the binding between 
//a receiver object and an action.
//Client: Creates a concrete command object and sets its receiver.
//Invoker: Asks the command to execute the request.
//Receiver: Knows how to perform the operations to fulfill a request.

//e.g:simple remote control system where a remote can execute commands for different 
//devices (like a light and a fan). The remote will use the Command pattern to encapsulate
//the commands.