package com.core.designpatterns.behavioralpattern.Observer;


//The Observer design pattern is a behavioral pattern that defines a one-to-many 
//dependency between objects. When one object (the subject) changes state, all its
//dependents (observers) are notified and updated automatically. This pattern is 
//commonly used in scenarios where a change in one object requires changing others, 
//and you want to maintain a loose coupling between the objects.

//e.g. WeatherStation (Subject) and multiple Display elements (Observers) that need 
//to update themselves whenever the weather changes.
public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherStation.addObserver(currentDisplay);
        weatherStation.addObserver(forecastDisplay);

        weatherStation.setMeasurements(25.5f, 65.0f, 1013.0f);
        weatherStation.setMeasurements(27.0f, 70.0f, 1010.0f);
	}

}
//Demonstrates the Observer pattern by creating a WeatherStation and adding two displays 
//(CurrentConditionsDisplay and ForecastDisplay). When the weather station updates its measurements,
//both displays are updated accordingly.