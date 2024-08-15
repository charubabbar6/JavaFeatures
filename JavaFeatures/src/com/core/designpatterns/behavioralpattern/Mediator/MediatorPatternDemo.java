package com.core.designpatterns.behavioralpattern.Mediator;

//The Mediator design pattern is used to define an object that encapsulates
//how a set of objects interact. This pattern promotes loose coupling by 
//keeping objects from referring to each other explicitly and allows their 
//interaction to be varied independently. It provides a central point for 
//communication between objects.
public class MediatorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteMediator mediator = new ConcreteMediator();

        ConcreteColleague1 colleague1 = new ConcreteColleague1();
        ConcreteColleague2 colleague2 = new ConcreteColleague2();
        colleague1.setMediator(mediator);
        colleague2.setMediator(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.send("Hello from Colleague1");
        colleague2.send("Hello from Colleague2");
    
	}

}
//Creates instances of colleagues and mediator, sets up their relationships, and demonstrates communication.