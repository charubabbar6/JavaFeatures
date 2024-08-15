package com.core.designpatterns.behavioralpattern.Observer;

//ConcreteObserver (Display Elements)
//Implements the Observer interface and updates its state based on the subject's state.
public class CurrentConditionsDisplay implements Observer {
	 private float temperature;
	    private float humidity;
	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
        this.humidity = humidity;
        display();
	}
	 public void display() {
	        System.out.println("Current conditions: " + temperature + "°C and " + humidity + "% humidity");
	    }
}
