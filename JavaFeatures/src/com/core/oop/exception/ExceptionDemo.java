package com.core.oop.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Dog dog=null;
			try {System.out.println(dog.dogname);}
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			/*catch(NullPointerException e) {//Unreachable catch block for NullPointerException. It is already handled by the catch block for Exception
				System.out.println(e.getMessage());
			}*/
	}

}
