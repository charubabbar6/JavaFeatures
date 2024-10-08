package com.core.oop.equalshashcodecontract;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
//	public boolean equals(Object o) {
//		if(o == null  || getClass() !=o.getClass())
//		{
//		return false;
//		}
//		if(o == this)
//		{
//			return true;
//		}
//		Employee e=(Employee)o;
//		return  (this.getId() ==e.getId());
//	}
}
