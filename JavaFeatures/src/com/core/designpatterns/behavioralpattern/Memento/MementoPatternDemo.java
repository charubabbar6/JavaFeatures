package com.core.designpatterns.behavioralpattern.Memento;

//The Memento design pattern is used to capture and externalize an object's 
//internal state without violating encapsulation, allowing the object to be 
//restored to this state later. This pattern is particularly useful for implementing 
//undo mechanisms in applications.
//e.g. Memento pattern with a TextEditor class where you can save and restore the text content.
public class MementoPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextEditor textEditor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        textEditor.setText("Initial Text");
        System.out.println("Current Text: " + textEditor.getText());

        caretaker.saveMemento(textEditor.saveStateToMemento());

        textEditor.setText("Second Version");
        System.out.println("Current Text: " + textEditor.getText());

        caretaker.saveMemento(textEditor.saveStateToMemento());

        textEditor.setText("Third Version");
        System.out.println("Current Text: " + textEditor.getText());

        // Restore to the second version
        textEditor.getStateFromMemento(caretaker.getMemento());
        System.out.println("Restored to: " + textEditor.getText());

        // Restore to the initial version
        textEditor.getStateFromMemento(caretaker.getMemento());
        System.out.println("Restored to: " + textEditor.getText());
	}

}
//Demonstrates saving and restoring different versions of the TextEditor's state. 
//It saves the editor's state, modifies it, and then restores previous states using the caretaker.