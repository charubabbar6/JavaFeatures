package com.core.oop.variable;

public class MyStaticVaiableClass {
	static int staticVariable=20; // Static variable

    public static void setStaticVariable(int value) {
        staticVariable = value;
    }

    public static void printStaticVariable() {
        System.out.println(staticVariable);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyStaticVaiableClass sv=new MyStaticVaiableClass();
//		System.out.println(sv.staticVariable);
//		MyStaticVaiableClass sv1=new MyStaticVaiableClass();
//		System.out.println(sv1.staticVariable);
		//MyStaticVaiableClass.setStaticVariable(100);
		MyStaticVaiableClass.printStaticVariable();
		
	}

}
//1.Inside a class, with static keyword
//2.Accessible by class and all instances
//3.Exists as long as the class is loaded	
//4.Initialized to default values if not set
//5.Heap memory (class context)
//6.Accessible via class name
//7. It can't be local