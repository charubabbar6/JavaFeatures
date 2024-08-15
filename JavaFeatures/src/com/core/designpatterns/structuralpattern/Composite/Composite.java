package com.core.designpatterns.structuralpattern.Composite;

import java.util.ArrayList;
import java.util.List;

//Composite class
public class Composite implements Component {
	
	private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		 for (Component child : children) {
	            child.operation();
	        }
	}

}
