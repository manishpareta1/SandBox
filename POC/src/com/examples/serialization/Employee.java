package com.examples.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee extends EmployeeSuperClass {
	
	private static final long serialVersionUID = 1L;
	
	public String name;
	public String address;
	public transient String SSN;
	public int number =0;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address+superId);
	}
	
	private void writeObject(ObjectOutputStream oos){
		System.out.println("calling writeObject");
		try {
			oos.defaultWriteObject();
			String s = "123" + SSN;
			oos.writeObject(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream ois){
		try {
			ois.defaultReadObject();
			String s = (String)ois.readObject();
			System.out.println("Executing readObject");
			SSN = s.substring(3);
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}