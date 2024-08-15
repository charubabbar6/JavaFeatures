package com.core.designpatterns.behavioralpattern.Memento;

import java.util.Stack;

//Caretaker Class
//Manages the memento objects and is responsible for storing and restoring them.
public class Caretaker {
	private final Stack<Memento> mementoStack = new Stack<>();

    public void saveMemento(Memento memento) {
        mementoStack.push(memento);
    }

    public Memento getMemento() {
        return mementoStack.pop();
    }
}
