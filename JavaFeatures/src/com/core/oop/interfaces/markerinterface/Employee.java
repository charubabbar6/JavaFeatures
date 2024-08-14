package com.core.oop.interfaces.markerinterface;

public class Employee implements Auditable {
	 private String name;
	    private int id;

	    public Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	    }

	    // Getters and setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }
}
