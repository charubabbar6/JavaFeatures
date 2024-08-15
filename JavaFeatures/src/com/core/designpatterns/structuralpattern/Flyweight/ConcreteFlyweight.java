package com.core.designpatterns.structuralpattern.Flyweight;

public class ConcreteFlyweight implements Flyweight {
	
	 private final String font;
	    private final int size;
	    private final String color;
	    
	    
	    
	public ConcreteFlyweight(String font, int size, String color) {
			super();
			this.font = font;
			this.size = size;
			this.color = color;
		}



	@Override
	public void display(char character) {
		// TODO Auto-generated method stub
		System.out.println("Character: " + character + ", Font: " + font + ", Size: " + size + ", Color: " + color);
	}

}
