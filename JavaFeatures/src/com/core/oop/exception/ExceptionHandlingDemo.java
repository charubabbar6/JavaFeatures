package com.core.oop.exception;

//CheckedException/compile time exception
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog=null;
		try {
		System.out.println(dog.dogname);
		}catch(NullPointerException e) {
			dog=new Dog();
			System.out.println(dog.dogname);
		}
	}

}
//Does “finally” always execute in Java?

//1.Not in following cases
//     “System.exit()” function
//      system crash

//An exception is an event that occurs during the execution of a program that 
//disrupts the normal flow of instructions. It is an object that represents an 
//error or an unusual condition that a program encounters during its execution. 
//Exceptions can be caused by a variety of issues, such as incorrect user input, 
//hardware failures, or programming errors.

//Throwable
//		-----Exception
//			----checked Exception
//					---IOException
//					---SQLException
//					---ClassNotFoundException
//			----unchecked/Runtime Exception
//					---NullPointerException
//					---NumberFormatException
//					---IndexoutofBoundException
//								---ArrayIndexoutof Bound Exception
//								---StringIndexOutofBoundException
//		-----Error
//				----Stackoverflow Error
//				----OutofMemory Error
//				----VirtualMachine Error
//		
		