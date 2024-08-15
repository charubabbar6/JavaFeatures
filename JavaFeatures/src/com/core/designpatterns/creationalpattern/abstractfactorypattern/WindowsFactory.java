package com.core.designpatterns.creationalpattern.abstractfactorypattern;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		// TODO Auto-generated method stub
		return new WindowsCheckbox();
	}

}
