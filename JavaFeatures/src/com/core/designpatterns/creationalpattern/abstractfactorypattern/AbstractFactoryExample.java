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
