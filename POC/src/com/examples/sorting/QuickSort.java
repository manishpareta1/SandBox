package com.examples.sorting;

public class QuickSort {
	
	public static void quickSort(int[] array, int start, int end) {
		
		if(start<end) {
			int partitionIndex = partition(array, start, end);
			quickSort(array, start, partitionIndex-1);
			quickSort(array,partitionIndex+1, end);
		}
	}
	
	protected static int partition(int[] array, int start, int end) {
		
		int pivot = array[end];
		int partionIndex = start;
		int temp = 0;
		for(int i=start;i<end;i++) {
			if(array[i]<pivot) {
				temp = array[i];
				array[i] = array[partionIndex];
				array[partionIndex] = temp;
				partionIndex++;
			}
		}
		temp = array[partionIndex];
		array[partionIndex] = array[end];
		array[end] = temp;
		//swap(array[partionIndex], pivot);
		return partionIndex;
	}
	
	
public static void quickSort(String[] array, int start, int end) {
		
		if(start<end) {
			int partitionIndex = partition(array, start, end);
			quickSort(array, start, partitionIndex-1);
			quickSort(array,partitionIndex+1, end);
		}
	}
	
	protected static int partition(String[] array, int start, int end) {
		
		String pivot = array[end];
		int partionIndex = start;
		String temp = "";
		for(int i=start;i<end;i++) {
			if(array[i].compareTo(pivot)>=0) {
				temp = array[i];
				array[i] = array[partionIndex];
				array[partionIndex] = temp;
				partionIndex++;
			}
		}
		temp = array[partionIndex];
		array[partionIndex] = array[end];
		array[end] = temp;
		//swap(array[partionIndex], pivot);
		return partionIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9,3,1,6,4,8,2,0,5,7};
		String[] stringArray = "TODO Auto-generated method stub".split(" ");
		quickSort(array, 0, array.length-1);
		quickSort(stringArray, 0, stringArray.length-1);
		for(int i : array) {
			System.out.print(i);
		}
		
		for(String sorted : stringArray) {
			System.out.print(sorted+ " ");
		}
	}
}
