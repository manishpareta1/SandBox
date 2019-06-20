package com.examples.searching;

public class BinarySearch {
	
	public static boolean binarySearch(int[] arr, int element) {
		
		if(arr.length == 1 && arr[0] != element )
			return false;
		
		if(arr.length == 1 && arr[0] == element)
			return true;
		
		int mid = arr.length/2;
		if(arr[mid] == element) {
			return true;
		}
		else if(element > arr[mid]) {
			int[] a = new int[arr.length - mid];
			for(int i=mid,j=0;i<arr.length;i++,j++) {
				a[j] = arr[i];
			}
			return binarySearch(a,element);
		}else {
			int[] a = new int[mid];
			for(int i=0;i<mid;i++) {
				a[i] = arr[i];
			}
			return binarySearch(a,element);
		
		}
	}
	
	public static int binarySearchOptimise(int[] arr, int firstIndex, int lastIndex, int element) {
		
		if(lastIndex >= firstIndex) {
			int mid = firstIndex + (lastIndex-1) / 2;
			
			if(element == arr[mid])
				return mid;
			if(element > arr[mid])
				return binarySearchOptimise(arr, mid+1, lastIndex, element);
			else		
				return binarySearchOptimise(arr, firstIndex, mid-1, element);
		}
		
		return -1;
	}
	
	static int binarySearchIterative(int arr[], int x) 
    { 
        int l = 0, r = arr.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
  

}
