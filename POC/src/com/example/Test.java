package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i = Integer.MIN_VALUE;
		int b = i; //Output with -i and i =-2147483648 -2147483648, '-' is magnitude which is not making any difference
		System.out.println(b+" "+i);
		
		Thread t = new MyThread() 
		{
			public void run() 
			{
				System.out.println(" foo");
			}
		};
		t.start();
	
	
		/*D d = new D();
		try {
			d.d();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		B a = new B();
		a.a();
		
		List<String> s = new ArrayList<String>();
		
		s.add("String");
		s.add("String1");
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			String x = (String) it.next();
			s.remove(x);
		}
		
		
		
	}
	
}


class A{
	
	public static void a() {
		System.out.println("1");
	}
}

class B extends A{
	public static void a() {
		System.out.println("a");
	}
	public void b() {
		A a = new A();
		a.a();
		System.out.println("2");
		
	}
}

/*class C{
	
	public void c() throws Exception {
		try {
		B b = new B();
		b.b();
		System.out.println("3");
		throw new Exception();
		}catch(Exception e) {
			System.out.println("in C");
			throw new Exception(e.getMessage());
		}finally {
			System.out.println("5");
		}
		
	}
}

class D{
	public void d() throws Exception {
		try {
			C c = new C();
			c.c();
			System.out.println("4");
			
		}catch(Exception e) {
			System.out.println("in D");
			throw new Exception(e.getMessage());
		}	
		}
}*/

class MyThread extends Thread
{
	MyThread() 
	{
		System.out.print(" MyThread");
	}
	public void run() 
	{
		System.out.print(" bar");
	}
	public void run(String s) 
	{
		System.out.println(" baz");
	}
}
class ThreadDemo 
{
	public static void main (String [] args) 
	{
		Thread t = new MyThread() 
		{
			public void run() 
			{
				System.out.println(" foo");
			}
		};
		t.start();
	}
}