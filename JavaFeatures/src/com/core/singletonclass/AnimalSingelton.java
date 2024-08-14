package com.core.singletonclass;

public class AnimalSingelton {
	
	private static AnimalSingelton single_instance=null;
	
	private AnimalSingelton() {
		
	}
	private static AnimalSingelton getInstance() {
		if(single_instance ==null)
		{
			single_instance= new  AnimalSingelton();
		}
		return single_instance;
	}

}
//Singelton class is a class whose only one instance can be created at any given time, in one jvm.
//1. make a constructor private
//in serialization implementation it won't work.'