package com.core.oop.inheritence.HybridInheritance;
//parent
public class Bat implements Animal, Flyable {
    public void eat() {
        System.out.println("The bat eats insects.");
    }

    public void fly() {
        System.out.println("The bat flies.");
    }

}
//combination of more than one type of inheritance(single and hierarchical combination)
//Java does not support hybrid inheritance directly with classes to avoid complexity, 
//it can be achieved through interfaces.