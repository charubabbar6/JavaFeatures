package com.core.designpatterns.behavioralpattern.Memento;

//Originator Class
//The object whose state needs to be saved and restored.
public class TextEditor {
	private String text;
	
	public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public Memento saveStateToMemento() {
        return new Memento(text);
    }

    public void getStateFromMemento(Memento memento) {
        text = memento.getState();
    }
}
