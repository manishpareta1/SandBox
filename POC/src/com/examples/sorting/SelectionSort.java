package com.examples.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,1,5,2,0};
		int[] sortedArray = selectionSort(arr);
		for(int a : sortedArray){
			System.out.println(a);
		}
	}
//int[] arr = {1,3,1,5,2,0};
	private static int[] selectionSort(int[] array){
		
		for(int i=0; i<array.length -1; i++){
			int min = i;
			for(int j = i+1; j<array.length;j++){
				if(array[min]> array[j]){
					min = j;
				}
				int temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}
		return array;
	}
}
