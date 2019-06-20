package com.examples.string.examples;

import java.util.ArrayList;
import java.util.List;

public class TestImmutableAnimal {
	
	public static void main(String[] args){
		
		Horse h = new Horse();
		h.setColor("White");
		h.setHeight(2);
		h.setLegs(4);
		h.setName("Badal");
		
		List<String> aList = new ArrayList<String>();
		aList.add("Reptiles");
		aList.add("Amphibianse");
		aList.add("Birds");	
		aList.add("Mamals");
		aList.add("Fish");
		aList.add("Invertebrats");
		aList.add("Dinos");
		aList.add("Insects");
		
		ImmutalbeAnimal iAnimal = new ImmutalbeAnimal(h, 1,aList);
		System.out.println(iAnimal.toString());
		aList.remove("Dinos");
		System.out.println(aList);
		h.setName("Chetak");
		System.out.println(h);
		System.out.println(iAnimal.toString());
	}

}


final class ImmutalbeAnimal{
	
	private final Horse horse;
	private final int count;
	private final List<String> animalType;
	
	
	
	public ImmutalbeAnimal(Horse horse, int count, List<String> animalType) {
		super();
		this.count = count;
		// below 5 lines are to make sure that we are creating a new object every time
		// when we are creating an object of mutable object inside immutable class
		Horse newHorse = new Horse();
		newHorse.setLegs(horse.getLegs());
		newHorse.setColor(horse.getColor());
		newHorse.setHeight(horse.getHeight());
		newHorse.setName(horse.getName());
		this.horse = newHorse;
		
		List<String> animlTypes = new ArrayList<String>();
		
		for(String s : animalType) {
			animlTypes.add(s);
		}
		
		this.animalType = animlTypes;
	}
	public Horse getHorse() {
		//in this method we are making sure that we are returning same object every time		
		Horse horse = new Horse();
		horse.setColor(this.horse.getColor());
		horse.setHeight(this.horse.getHeight());
		horse.setLegs(this.horse.getLegs());
		return horse;
	}
	
	public List<String> getAnimalType() {
		//in this method we are making sure that we are returning same object every time		
		List<String> animlTypes = new ArrayList<String>();

		for(String s : this.animalType) {
			animlTypes.add(s);
		}
		return animlTypes;
	}
	
	public int getCount() {
		return count;
	}
	@Override
	public String toString() {
		return "ImmutalbeAnimal [horse=" + horse + ", count=" + count + ", animalType=" + animalType + "]";
	}
	
	
}


class Horse{
	
	private int legs;
	private int height;
	private String color;
	private String name;
	
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Horse [legs=" + legs + ", height=" + height + ", color=" + color + ", name=" + name + "]";
	}
	
	
}