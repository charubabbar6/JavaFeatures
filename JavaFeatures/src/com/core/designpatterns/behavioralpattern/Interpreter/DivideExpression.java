package com.core.designpatterns.behavioralpattern.Interpreter;

public class DivideExpression implements Expression {
	private Expression leftExpression;
    private Expression rightExpression;

    public DivideExpression(Expression left, Expression right) {
        this.leftExpression = left;
        this.rightExpression = right;
    }
	@Override
	public int interpret() {
		// TODO Auto-generated method stub
		return leftExpression.interpret() / rightExpression.interpret();
	}

}
