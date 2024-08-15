package com.core.designpatterns.behavioralpattern.Iterator;

//2. Define the Aggregate Interface:
public interface IterableCollection<T> {
    Iterator<T> createIterator();
}
