package com.examples.cloning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AbstractTestClass {
	
	public static void main(String[] arg) {
		
		A a = new A();
		A b = new B();
		A c = new C();
		
		System.out.println("a: "+a.getName()+" b: "+b.getName()+" c: "+c.getName());
		
		Map<String,String> string = new HashMap<String,String>();
		
		string.put("Manish", "Manish");
		string.put("Manish", "Pareta");
		string.put("Meeta", "Pareta");
		System.out.println(string);
		Set<Entry<String, String>> entrySet= string.entrySet();
		System.out.println(entrySet);
	}
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
}
class A {
	
	String name = "JohnA";
	static String getName() {
		return "";
		}
}

class B extends A{
	
	String name = "JohnB";
	
	static String  getName() {
	return "";
	}
}

class C extends A{
	
	String name = "JohnC";
	String getName(String name) {
		return this.name;
		}
}

