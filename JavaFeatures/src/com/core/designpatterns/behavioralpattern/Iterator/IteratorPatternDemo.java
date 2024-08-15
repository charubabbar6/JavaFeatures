package com.core.designpatterns.behavioralpattern.Iterator;

//The Iterator design pattern is a behavioral design pattern that allows 
//sequential access to elements of a collection without exposing its underlying 
//representation. This pattern provides a way to access the elements of an aggregate 
//object without exposing its internal structure.
public class IteratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.add("Item 1");
        aggregate.add("Item 2");
        aggregate.add("Item 3");

        Iterator<String> iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println(item);
        }
	}

}
