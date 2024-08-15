package com.core.designpatterns.behavioralpattern.command;

//Concrete Command to turn off the fan
public class FanOffCommand implements Command {
 private Fan fan;

 public FanOffCommand(Fan fan) {
     this.fan = fan;
 }

 @Override
 public void execute() {
     fan.off();
 }

 @Override
 public void undo() {
     fan.on();
 }
}