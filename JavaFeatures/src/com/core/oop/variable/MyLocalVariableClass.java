package com.core.oop.variable;

public class MyLocalVariableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLocalVariableClass lv =new MyLocalVariableClass();
		lv.method();
	}
	public void method() {
	    int localVariable = 10; // Local variable
	    System.out.println(localVariable);
	}
}
//1.Inside methods, constructors, or blocks
//2.Limited to the block where defined
//3.Exists during method/block execution
//4.Must be explicitly initialized
//5.Stack memory (method context)
//6.Accessible only within the block
//7. Access modifier can't be used for local variable