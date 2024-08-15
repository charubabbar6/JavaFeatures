package com.core.designpatterns.behavioralpattern.Interpreter;

//Implement Concrete Expressions
public class NumberExpression implements Expression {
	 private int number;

	    public NumberExpression(int number) {
	        this.number = number;
	    }
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return number;
	}

}
