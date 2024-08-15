package com.core.designpatterns.behavioralpattern.Observer;

//Interface that defines methods for attaching, detaching, and notifying observers.
public interface Subject {
	 void addObserver(Observer observer);
	    void removeObserver(Observer observer);
	    void notifyObservers();
}
