package com.core.designpatterns.structuralpattern.proxy;

public class Proxy implements Subject {

	private RealSubject realSubject;
	@Override
	public void request() {
		// TODO Auto-generated method stub
		if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
	}

}
