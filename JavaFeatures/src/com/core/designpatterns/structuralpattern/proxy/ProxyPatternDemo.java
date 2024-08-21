package com.core.designpatterns.structuralpattern.proxy;

//The Proxy Pattern provides a surrogate or placeholder for another object to
//control access to it.
public class ProxyPatternDemo {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	Subject subject = new Proxy();
    subject.request();
}
}
//client-->calls/creates proxy instance-->proxy-->
//calls method of real subject only after proper security check and authentications.-->
//Real subject