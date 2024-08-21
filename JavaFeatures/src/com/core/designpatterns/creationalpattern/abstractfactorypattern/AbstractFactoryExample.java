package com.core.designpatterns.creationalpattern.abstractfactorypattern;

//Provides an interface for creating families of related or dependent objects without 
//specifying their concrete classes.

public class AbstractFactoryExample {
	private Button button;
    private Checkbox checkbox;
    
    public AbstractFactoryExample(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    public void renderUI() {
        button.render();
        checkbox.paint();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GUIFactory factory = new WindowsFactory();
	        AbstractFactoryExample app = new AbstractFactoryExample(factory);
	        app.renderUI();
	        
	        factory = new MacFactory();
	        app = new AbstractFactoryExample(factory);
	        app.renderUI();
	}

}
//This factory is also called as factory of factories. 
//Abstract Factory lets a class returns a factory of classes. 
//So, this is the reason that Abstract Factory Pattern is one level higher than the Factory Pattern.

//An Abstract Factory Pattern is also known as Kit.
//
//Steps:
//1) create main class which call factory of factory class.
//2) Factory of factory / factory Producer creates instance of factory class.
//3) Factory class returns required class instance 


//Main class--->AbstractFactoryProducer--->AbstractFactory---->ProfessionAbstractFactory---->Profession|---->Engineer
//														|											 |---->Teacher
//														|
//														|--->TraineeAbstractFactory----->Profession----->TrainneEngineer
//																									|
//																									|--->TraninneTeacher