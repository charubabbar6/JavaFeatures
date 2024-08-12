package com.core.oop.accessmodifier.visibilitycontrol.restrictedaccess;
//Another class in the same package
public class AnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass subclass = new Subclass();
        subclass.publicMethod(); // Accessible
        subclass.protectedMethod(); // Accessible within the same package
	}

}
//Can we restrict visibility of derived method in Java ? || visibility control in java

//No