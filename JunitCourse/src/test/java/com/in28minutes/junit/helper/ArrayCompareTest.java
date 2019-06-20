package com.in28minutes.junit.helper;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testSortingOfArray() {
		int[] actual = {1,4,2,9,0};
		int[] expected = {0,1,2,4,9};
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
		
	}
	/*
	 * @Testing Exception
	 * Its like you are expecting an exception, 
	 * If exception occures then its success or positive case
	 * else if there is no exception generated then its a negative case means your test failed
	 * 
	 */
	@Test(expected=NullPointerException.class)
	public void testSortingOfArray_ThrowsNullPointer() {
		int[] actual = null;//{1,4,2,9,0}; 
		int[] expected = {0,2,1,4,9};
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
		
	}
	@Test(timeout=20)
	public void testPerformance_ArraysSort() {
		int[] array = {0,2,1,4,9};
		for(int i=0;i<100000;i++){
			array[0]= i;
			Arrays.sort(array);
		}
	}

}
