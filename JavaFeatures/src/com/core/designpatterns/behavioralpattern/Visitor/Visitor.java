package com.core.designpatterns.behavioralpattern.Visitor;

//Visitor Interface
//Defines a visit method for each type of element.
public interface Visitor {
	void visit(Circle circle);
    void visit(Rectangle rectangle);
}
