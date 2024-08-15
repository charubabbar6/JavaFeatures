package com.core.designpatterns.structuralpattern.Composite;

//The Composite Pattern lets you compose objects into tree structures 
//	to represent part-whole hierarchies.
public class CompositePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component leaf1 = new Leaf();
        Component leaf2 = new Leaf();
        
        Composite composite = new Composite();
        composite.add(leaf1);
        composite.add(leaf2);

        composite.operation();  // Output: Leaf operation
                                //         Leaf operation
	}

}
