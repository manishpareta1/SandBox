package com.examples.test;

public class MethodLocalInnerClass {
	public int x =20;
	
	public void doStuff() {
		int i = 10;
		class MyMethodLocalClass {
			public void methodLocalInnerClassMethod() {
			System.out.println("MethodLocalInnerClass, i: "+i+" | x: "+x);
			}
		}  
		MyMethodLocalClass m = new MyMethodLocalClass();
		m.methodLocalInnerClassMethod();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalInnerClass outerClass = new MethodLocalInnerClass();
		outerClass.doStuff();
	}

}
