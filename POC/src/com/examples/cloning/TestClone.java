package com.examples.cloning;

import java.util.Date;

public class TestClone {

	public TestClone() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Department dept = new Department(10, "CS");
		Employee original = new Employee(10, "Manish", dept);
		Date d = new Date(2015, 05, 10);
		//Shal
		Employee clone = (Employee) original.clone();
		
		//Updating permitive values of clone.
		clone.setId(2);
		
		System.out.println("Clone id: "+clone.getId()+" Clone Joining Date: "+clone.getJoiningDate()+" | "+"Clone Dept: "+clone.getDept().toString());
		System.out.println("original id: "+original.getId()+" original Joining Date: "+original.getJoiningDate()+" | "+"original Dept: "+original.getDept().toString());
		
		//Updating Clode date object.
		clone.setJoiningDate(d);
		
		System.out.println("Clone Joining Date: "+clone.getJoiningDate()+" original Joining Date: "+original.getJoiningDate() );
		System.out.println("************************************************************************************");
		
		
		//Resting the value of Reference type which will have impact on both the objects
		clone.getDept().setName("HR");
		System.out.println("Clone Dept: "+clone.getDept().toString());
		System.out.println("original Dept: "+original.getDept().toString());
	}

}
