package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {
	// MyMath.sum
	// 1,2,3 => 6
	MyMath myMath = new MyMath(); 
	
	// runs before any test case
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	// runs after any test case
	@After
	public void after() {
		System.out.println("After");
	}
	
	// runs at the beginning of the class
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	// runs at the end of the class
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	
	@Test
	public void sum_with3numbers() {
		System.out.println("First Test");
		// Check that the result is 6
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_with1number() {
		System.out.println("Second Test");
		// Check that the result is 6
		assertEquals(3, myMath.sum(new int[] {3}));
	}

}
