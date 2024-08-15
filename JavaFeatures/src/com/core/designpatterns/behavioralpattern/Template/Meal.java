package com.core.designpatterns.behavioralpattern.Template;

//Abstract Class (Template)
//Defines the template method that outlines the algorithm's structure and 
//calls primitive operations that can be overridden by subclasses.
public abstract class Meal {
	 // Template method
    public final void prepareMeal() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
 // Common steps
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }
 // Abstract methods to be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();
}
