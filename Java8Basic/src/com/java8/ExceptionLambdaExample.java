package com.java8;

import java.util.function.BiConsumer;

public class ExceptionLambdaExample {
	static int[] i = {1,2,3,4,5,6};
	static int j = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process(wraperProcess((t,v) -> System.out.println(t/v)));
		
	}
	public static void process(BiConsumer<Integer, Integer> biConsumer) {//Biconsumer is a Functional Interface by java.util.function
		for(int k : i) {
			biConsumer.accept(k, j);
		}
	}
	
	// created a new wraper method to handle exception. its additional code but for the sake of mantainability it is good practice to 
	//write code this way. exception at line no 11 could have been handled in similar way at same line, but to increase readability its 
	// written this way.
	public static BiConsumer<Integer, Integer> wraperProcess(BiConsumer<Integer, Integer> consumer){
		
		return (v,k) -> {
		try {
			consumer.accept(v, k);
		}catch(ArithmeticException e) {
			System.out.println("Exception occured in wraperProces| " + e.getMessage());
		}}
		
		;
	}
}
