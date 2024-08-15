package com.core.designpatterns.structuralpattern.Facade;

//Facade class
public class Facade {
	
	private SubsystemA subsystemA = new SubsystemA();
    private SubsystemB subsystemB = new SubsystemB();
    
    public void operation() {
        subsystemA.operationA();
        subsystemB.operationB();
    }

}
