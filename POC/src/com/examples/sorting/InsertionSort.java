package com.examples.sorting;

import java.util.GregorianCalendar;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {15,2,5,9,3,5,0,2,7,9};
		int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int [] arr2 = {10,9,8,7,6,5,4,3,2,1};
		
		int [] sortedArray = insertionSort(arr);
		for(int j : sortedArray){
			System.out.println(j);
		}
	}
	
	private static int[] insertionSort(int[] array){
		
		if(array == null || array.length == 0){
			System.out.println("Nothing found to be sorted, Pleaes check the elements in Aarry");
			return null;
		}
		long start = GregorianCalendar.getInstance().getTimeInMillis();
		for(int i = 1; i <= array.length - 1; i++){
			int value = array[i];
			int loc = i;
			while(loc > 0 && array[loc-1] > value){
				array[loc] = array[loc-1];
				loc = loc-1;
			}
			array[loc] = value;
		}
		long end = GregorianCalendar.getInstance().getTimeInMillis();
		System.out.println("time taken with "+array.length+" inputs "+(end - start) +"milisecs");
	return array;	
	}

}
