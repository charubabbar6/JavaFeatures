package com.core.designpatterns.behavioralpattern.command;

//Concrete Command to turn on the fan
public class FanOnCommand implements Command{
	private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		 fan.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		 fan.off();
	}

}
