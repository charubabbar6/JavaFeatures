package com.core.designpatterns.behavioralpattern.Template;

//Concrete Class
// Implements the abstract steps of the algorithm defined in the abstract class.
public class Coffee extends Meal {

	@Override
	protected void brew() {
		// TODO Auto-generated method stub
		System.out.println("Dripping coffee through filter...");
	}

	@Override
	protected void addCondiments() {
		// TODO Auto-generated method stub
		 System.out.println("Adding sugar and milk...");
	}

}
