package com.core.designpatterns.behavioralpattern.Interpreter;

public class ParenthesesExpression implements Expression {
	private Expression  expression;
    

    public ParenthesesExpression(Expression  expression) {
        this.expression =  expression;
     
    }
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return expression.interpret();
	}

}
