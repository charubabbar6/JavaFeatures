package com.core.designpatterns.behavioralpattern.Interpreter;

import java.util.Stack;

public class ExpressionParser {
	public static Expression parse(String expression) {
        Stack<Expression> stack = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                int number = Character.getNumericValue(ch);
                stack.push(new NumberExpression(number));
            } else if (ch == '+') {
                operators.push(ch);
            } else if (ch == '-') {
                operators.push(ch);
            } else if (ch == '*') {
                operators.push(ch);
            } else if (ch == '/') {
                operators.push(ch);
            } else if (ch == '(') {
                // Handle parentheses
                operators.push(ch);
            } else if (ch == ')') {
                // Handle closing parenthesis
                while (operators.peek() != '(') {
                    processOperator(stack, operators.pop());
                }
                operators.pop(); // Remove '('
            }
        }

        while (!operators.isEmpty()) {
            processOperator(stack, operators.pop());
        }

        return stack.pop();
}
	private static void processOperator(Stack<Expression> stack, char operator) {
        Expression right = stack.pop();
        Expression left = stack.pop();
        Expression expression = null;

        switch (operator) {
            case '+':
                expression = new AddExpression(left, right);
                break;
            case '-':
                expression = new SubtractExpression(left, right);
                break;
            case '*':
                expression = new MultiplyExpression(left, right);
                break;
            case '/':
                expression = new DivideExpression(left, right);
                break;
        }

        stack.push(expression);
    }
}