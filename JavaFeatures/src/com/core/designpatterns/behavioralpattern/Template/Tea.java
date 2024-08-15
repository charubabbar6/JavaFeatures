package com.core.designpatterns.behavioralpattern.Template;

//Concrete Class
// Implements the abstract steps of the algorithm defined in the abstract class.
public class Tea extends Meal {

	@Override
	protected void brew() {
		// TODO Auto-generated method stub
		 System.out.println("Steeping the tea...");
	}

	@Override
	protected void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding lemon...");
	}

}
