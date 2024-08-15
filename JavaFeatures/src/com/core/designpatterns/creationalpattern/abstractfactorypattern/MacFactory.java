package com.core.designpatterns.creationalpattern.abstractfactorypattern;

public class MacFactory implements GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new MacCheckbox();
	}

}
