package com.core.oop.variable;

public class MyInstanceVariableClass {
	
	//int instanceVariable; // Instance variable
	
	public void setVariable(int value) {
        instanceVariable = value;
    }

    public void printVariable() {
        System.out.println(instanceVariable);
    }
    int instanceVariable; // Instance variable//POINT NO. 8
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInstanceVariableClass iv=new MyInstanceVariableClass();
		iv.setVariable(10);
		iv.printVariable();
	}

}
//1.Inside a class, but outside methods
//2.Accessible by instance methods
//3.Exists as long as the object exists
//4.Initialized to default values if not set
//5.Heap memory (part of the object)
//6.Accessible via object reference
//7. Access Modifier can be given for instance variable
//8. We can declare instance variable after using the variable as well
