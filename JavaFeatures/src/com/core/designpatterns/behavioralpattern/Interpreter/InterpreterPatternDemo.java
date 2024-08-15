package com.core.designpatterns.behavioralpattern.Interpreter;

//The Interpreter pattern is a behavioral design pattern that defines
//a grammatical representation for a language and provides an interpreter
//to interpret sentences in the language. It's often used in scenarios where
//you need to evaluate expressions or commands in a domain-specific language.
public class InterpreterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create expressions
        Expression five = new NumberExpression(5);
        Expression ten = new NumberExpression(10);
        
        String expression = "3+(5*2)-8/(4-2)";

        // Create an addition expression
        Expression addExpression = new AddExpression(five, ten);

        // Evaluate and print the result
        System.out.println("Result: " + addExpression.interpret());
        
        
        Expression parsedExpression = ExpressionParser.parse(expression);
        
        System.out.println("Result: " + parsedExpression.interpret());
	}

}
