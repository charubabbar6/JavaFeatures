package com.core.designpatterns.behavioralpattern.Mediator;

//Implements the Mediator interface and coordinates communication between colleague objects.
public class ConcreteMediator implements Mediator {
	private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;
    
    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }
	@Override
	public void send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		if (colleague == colleague1) {
            colleague2.receive(message);
        } else if (colleague == colleague2) {
            colleague1.receive(message);
        }
	}

}
