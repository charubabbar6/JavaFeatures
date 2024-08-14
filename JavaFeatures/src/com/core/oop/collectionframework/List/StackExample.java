package com.core.oop.collectionframework.List;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Stack
        Stack<String> stack = new Stack<>();
        
        // Push elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        
        // Peek at the top element
        System.out.println("Top element: " + stack.peek()); 
        
     // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        
     // Check remaining elements
        System.out.println("Remaining Stack elements:");
        for (String fruit : stack) {
            System.out.println(fruit);
        }
	}

}
//Stack is a LIFO (Last-In-First-Out) stack implementation. It extends Vector with methods to push, pop, and peek at elements.