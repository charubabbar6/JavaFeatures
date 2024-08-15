package com.core.designpatterns.behavioralpattern.Observer;

public class ForecastDisplay implements Observer {
	 private float temperature;
	    private float pressure;
	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
        this.pressure = pressure;
        display();
	}
	 public void display() {
		 System.out.println("Forecast: Temperature: " + temperature + "°C and Pressure: " + pressure + " hPa");
	    }
}
