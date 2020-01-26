package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	// MyMath.sum
	// 1,2,3 => 6
	MyMath myMath = new MyMath(); 
	
	@Test
	public void sum_with3numbers() {
		
		// Check that the result is 6
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_with1number() {
		// Check that the result is 6
		assertEquals(3, myMath.sum(new int[] {3}));
	}

}
