package com.core.designpatterns.behavioralpattern.Visitor;

//Element Interface
//Defines an accept method that takes a visitor.
public interface Shape {
	void accept(Visitor visitor);
}
