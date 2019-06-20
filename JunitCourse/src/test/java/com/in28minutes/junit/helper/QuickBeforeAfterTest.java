package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("Before Class - its a class level mentod and has static scope!!");
	}

	@Before
	public void before() {
		System.out.println("Before Assert - it executes before every test!!");
	}
	
	@Test
	public void test(){
		System.out.println("In Test");
	}

	@After
	public void afterTest(){
		System.out.println("After Test - it executes after ever test!!");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("After Class - its a class level method and has static scope!!");
	}
}
