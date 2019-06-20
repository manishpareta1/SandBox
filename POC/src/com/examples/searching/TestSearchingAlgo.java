package com.examples.searching;

import java.util.Calendar;

public class TestSearchingAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,6,7,10,11,13,15,16,19,20,12,22,23,2,4,25,26,};
		long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		long start = Calendar.getInstance().getTimeInMillis();
		System.out.println(BinarySearch.binarySearch(arr, 2));
		long end = Calendar.getInstance().getTimeInMillis();
		long afterUsedmem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		System.out.println("Time taken: "+ (end-start) + " And Memory used: "+ (afterUsedmem - beforeUsedMem));
		
		start = Calendar.getInstance().getTimeInMillis();
		System.out.println(BinarySearch.binarySearchOptimise(arr, 0, arr.length, 2));
		end = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time taken: "+ (end-start));
		
		start = Calendar.getInstance().getTimeInMillis();
		System.out.println(BinarySearch.binarySearchIterative(arr, 2));
		end = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time taken: "+ (end-start));
	}

}
