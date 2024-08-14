package com.core.oop.interfaces.markerinterface;

public class MarkerInterfaceDemo {
	public static void main(String[] args) {
//		Employee employee = new Employee("Alice", 1);
//		 if (employee instanceof Auditable) {
//			 System.out.println("The class is auditable.");
//	        } else {
//	            System.out.println("The class is not auditable.");
//	        }
		
		Class<?> clazz = Employee.class;
		 if (Auditable.class.isAssignableFrom(clazz)) {//reflection to check if a class implements a marker interface
	            System.out.println("The class implements Auditable.");
	        } else {
	            System.out.println("The class does not implement Auditable.");
	        }

	}
}
//a marker interface is a design pattern used to indicate that a class possesses certain 
//properties or capabilities without requiring methods or fields. Marker interfaces essentially
//provide metadata about a class.
//In Java, a marker interface is an interface that does not declare any methods. 
//It is used to "mark" classes that implement it. A common example is the Serializable/clonnable
//interface, which marks classes whose instances can be serialized into a byte stream.
//Marker interfaces are used to convey metadata and control the behavior of classes without
//adding methods.