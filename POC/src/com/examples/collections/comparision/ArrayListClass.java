package com.examples.collections.comparision;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Animal(2,"Duck"));
	}

}

class Animal implements Comparable<Animal>{
	
	private int legs;
	private String type;
	
	public Animal(int legs, String type){
		
		this.legs = legs;
		this.type = type;
	}
	
	
	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	
	@Override
	public int hashCode(){
		
		int result = 17;
		result = 31 * result + new Integer(this.legs).hashCode();
		result = 31 * result + this.type.hashCode();
		
		return result;
	}
	
	@Override
	public boolean equals(Object obj){
		
		if(obj == null)
			return false;
		
		if(obj instanceof Animal){
			final Animal animal = (Animal) obj;
			return (this.legs == animal.legs) && (this.type.equals(animal.type));
		}else{
			return false;
		}
	}
	
	public int compareTo(Animal a){
		
		if(a == null){
			return -1;
		}
		if((this.legs - a.legs) == 0){
			return this.type.compareTo(a.type);
		}else{
			return this.legs - a.legs;
		}
		
		

	}
	
}
