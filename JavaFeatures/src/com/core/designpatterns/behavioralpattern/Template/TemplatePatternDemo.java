package com.core.designpatterns.behavioralpattern.Template;

//The Template design pattern defines the skeleton of an algorithm 
//in a base class but lets subclasses override specific steps of the
//algorithm without changing its structure. This pattern is useful when 
//you have a series of steps that are common across different implementations
//but with some steps that may vary.
public class TemplatePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Meal tea = new Tea();
	        Meal coffee = new Coffee();

	        System.out.println("Preparing tea:");
	        tea.prepareMeal();
	        
	        System.out.println("\nPreparing coffee:");
	        coffee.prepareMeal();
	}

}
// a scenario where we have a generic Meal class that outlines the steps to prepare a meal, 
//and specific meal types (Tea and Coffee) will implement the specific steps.