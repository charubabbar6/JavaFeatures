package com.core.oop.accessmodifier.visibilitycontrol.restrictedaccess;

//Subclass in the same package
class Subclass extends Superclass {
 @Override
 public void publicMethod() {
     System.out.println("Overridden public method in Subclass");
 }

 @Override
 //private void protectedMethod() {//can't reduce visibility in subclass 
 protected void protectedMethod() {
     System.out.println("Overridden protected method in Subclass");
 }

}
//public->protected->default->private