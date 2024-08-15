package com.core.designpatterns.behavioralpattern.command;

//Concrete Command to turn off the light
public class LightOffCommand implements Command {
	private Light light;
	
	public LightOffCommand(Light light) {
        this.light = light;
    }
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		 light.on();
	}

}
