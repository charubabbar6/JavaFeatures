package com.core.designpatterns.behavioralpattern.Iterator;

import java.util.List;

//3.Implement the Concrete Iterator:
public class ConcreteIterator<T> implements Iterator<T> {
	 private List<T> items;
	    private int position;
	    
	    
	    public ConcreteIterator(List<T> items) {
	        this.items = items;
	        this.position = 0;
	    }


	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		 return position < items.size();
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		 return items.get(position++);
	}

}
