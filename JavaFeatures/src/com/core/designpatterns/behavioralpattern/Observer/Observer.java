package com.core.designpatterns.behavioralpattern.Observer;

//Interface for objects that should be notified of changes in the subject.
public interface Observer {
	void update(float temperature, float humidity, float pressure);
}
