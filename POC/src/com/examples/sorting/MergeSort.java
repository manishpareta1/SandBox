package com.examples.sorting;

public class MergeSort {
	
	int[] arr = {4,4,1,5,3,7,3,8,4,9,5,1,0};
	
	/*
	 * First break the problem in smaller array
	 * then merge the elements
	 */
	public int[] mergeSort(int[] arr){
		
		if(arr.length<2)
			return arr;
		int n = arr.length;
		int mid = arr.length/2;
		
		int[] leftArr = new int[mid]; //= int [mid];
		int[] rightArr =  new int[arr.length-mid];
		
		for(int i=0; i<mid; i++){
			leftArr[i] = arr[i];
		}
		
		for(int i=0; i<arr.length-mid; i++){
			rightArr[i] = arr[mid+i];
		}
		
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(leftArr, rightArr, arr);
		
		
		return arr;
	}

	/*
	 * take first element from both the arrays, left and right
	 * compare them each other, which ever is less store it in original array at first index
	 * now compare the remaining element from previous comparision and compare it with other 
	 * array and move so on.
	 */
	public void merge(int[] leftArr, int[] rightArr, int[] originalArr){
		
		int i = 0,j = 0,k = 0;
		
		while(i<leftArr.length && j<rightArr.length){
			
			if(leftArr[i]<=rightArr[j]){
				originalArr[k] = leftArr[i];
				i++;
			}else{
				originalArr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i<leftArr.length){
			originalArr[k++] = leftArr[i++];
		}
		while(j<rightArr.length){
			originalArr[k++] = rightArr[j++];
		}
		
	}
	
	public static void main(String[] args){
		MergeSort msort = new MergeSort();
		for(int k : msort.mergeSort(msort.arr)){
		System.out.print(k);
		}
	}
}
