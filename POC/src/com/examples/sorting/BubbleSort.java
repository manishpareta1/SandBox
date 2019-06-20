package com.examples.sorting;

/**
 * @author manish.pareta
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,0,3,4,5,6,8,7,9}; 
		int[] sortedArray = bubbleSort(arr);
		for(int a : sortedArray){
			System.out.println(a);
		}
	}

	
	private static int[] bubbleSort(int[] array){
		
		if(array == null && array.length == 0){
			System.out.println("No element found to sort");
		return null;
		}
		int count = 0;
		for(int j =0; j<array.length-1; j++){
			int flag=0;
			for (int i = 0; i<array.length-1-j; i++){ 
				if(array[i]<array[i+1]){
					
					int temp = array[i];
					array[i] = array[i+1] ;
					array[i+1] = temp;
					flag = 1;
					count++;
				}
			}if(flag == 0)
				break;
		}
		System.out.println("total loop "+count);
		return array;
	}
}
