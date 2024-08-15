package com.core.designpatterns.behavioralpattern.Observer;

import java.util.ArrayList;
import java.util.List;



//ConcreteSubject (WeatherStation)
//Implements the Subject interface and maintains the state. It notifies observers of any changes.
public class WeatherStation implements Subject {
	 private List<Observer> observers = new ArrayList<>();
	    private float temperature;
	    private float humidity;
	    private float pressure;
	    
	    public void setMeasurements(float temperature, float humidity, float pressure) {
	        this.temperature = temperature;
	        this.humidity = humidity;
	        this.pressure = pressure;
	        notifyObservers();
	    }
	    @Override
	    public void addObserver(Observer observer) {
	        observers.add(observer);
	    }

	    @Override
	    public void removeObserver(Observer observer) {
	        observers.remove(observer);
	    }

	    @Override
	    public void notifyObservers() {
	        for (Observer observer : observers) {
	            observer.update(temperature, humidity, pressure);
	        }

}
		
}