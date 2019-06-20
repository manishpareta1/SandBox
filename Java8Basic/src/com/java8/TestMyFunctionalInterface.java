package com.java8;

public class TestMyFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fun = () -> System.out.println("My First Functional Interface");
		fun.doSomething();
		int a =10, b=20;
		
		CalculatorFunctionalInterface cal = (i, j) -> i+j;
		System.out.println("Sum of "+ a+" & "+b+" is "+cal.calculate(a, b));
		cal = (i, j) -> i*j;
		System.out.println("multiplication of "+ a+" & "+b+" is "+cal.calculate(a, b));
	}

}
