package com.core.designpatterns.structuralpattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private final Map<String, Flyweight> flyweights = new HashMap<>();
	
	 public Flyweight getFlyweight(String font, int size, String color) {
		 
		 String key = font + "-" + size + "-" + color;
		 if (!flyweights.containsKey(key)) {
			 flyweights.put(key, new ConcreteFlyweight(font, size, color));
		 }
		return flyweights.get(key);
		 
	 }
}
