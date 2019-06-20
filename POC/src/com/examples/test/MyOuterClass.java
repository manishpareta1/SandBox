package com.examples.test;

public class MyOuterClass {
	
	public int i =10;
	private String s = "Outer Variable";
	private static String outerStaticVar = "Outer static Variable";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	MyOuterClass myouter = new MyOuterClass();
	MyOuterClass.MyInner inner = myouter.new MyInner();
	inner.innerPrint();
	
	}
	
	public void outerPrint() {
		System.out.println("Outer Static Var:"+ outerStaticVar);
	}
	
	class MyInner{
		private int i =20;
		
		public void innerPrint() {
			System.out.println("value of inner i: "+ i);
			System.out.println("value of outer s: "+ s);
			System.out.println("value of outer stati var: "+ outerStaticVar);
			System.out.println("value of outer i: "+ MyOuterClass.this.i);
		}
	}

}

