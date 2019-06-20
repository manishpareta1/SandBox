package com.java8.comparatorAPI;

import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {
	
	public int compare(T t1,T t2);
	
	/*
	 * 1. Type Specific Comparator
	 * public static Comparator comparing(Function<Person, Integer> f) {
	 * 
	 * return (p1,p2) -> f.apply((Person) p1) - f.apply((Person) p2); }
	 */
	
	//2. Generic Comparator for all type using Comparable as return type
	/*
	 * public static Comparator comparing(Function<Person, Comparable> f) {
	 * 
	 * return (p1,p2) -> f.apply((Person) p1).compareTo(f.apply((Person) p2)); }
	 */
	
	//3. More generic comparator to work on any type of object
	
	public static <U> Comparator<U> comparing(Function<U, Comparable> f) {
		
		return (p1,p2) -> f.apply((U) p1).compareTo(f.apply((U) p2));
	}

	
	public default Comparator<T> thenCompare(Comparator<T> comp){
		
		return (p1, p2) -> compare(p1,p2) == 0 ? comp.compare(p1,p2) : comp.compare(p1,p2);
	}
	
	//This function is to facilitate the object values for which the comparison has to be done.
	public default Comparator<T> thenCompare(Function<T, Comparable> f){
		
		return thenCompare(comparing(f));
	}

}
