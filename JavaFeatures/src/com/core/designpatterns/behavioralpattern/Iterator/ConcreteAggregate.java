package com.core.designpatterns.behavioralpattern.Iterator;

import java.util.ArrayList;
import java.util.List;

//. Implement the Concrete Aggregate:
public class ConcreteAggregate<T> implements IterableCollection<T> {
	private List<T> items;

    public ConcreteAggregate() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator<T> createIterator() {
    	// Explicitly specify the type argument
        return new ConcreteIterator<T>(items);
    }

}
