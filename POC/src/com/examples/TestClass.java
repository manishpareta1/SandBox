package com.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestClass {

	public TestClass() {
		// TODO Auto-generated constructor stub
	}
	int i = 0;
	
	static int[] arr = {3,1,5,3,8,9,4,0,7,2} ;
	public static void main(String[] args) {
		
		System.out.println();
		printPayramid(4);
		sortArray(arr, 4);
		
		
		
		// TODO Auto-generated method stub
		System.out.println("Please enter 10 elements");
		Scanner in = new Scanner(System.in);
		int i = 0;
		while(in.hasNext()){
			arr[i] = in.nextInt();
			System.out.println(arr[i]);
			i++;
			if(i==3)
				break;
		}
		duplicateElements();
	}
	
	
	
	
	
	
	public static void duplicateElements(){
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int a : arr){
			if(map.containsKey(a)){
				int i = map.get(a);
				map.put(a, ++i);
			}else{
				map.put(a, 1);
			}
		}
		System.out.println(map);
		Set<Integer> key = map.keySet();
		System.out.println(key);
		for(int j : key)
			if(map.get(j) >1)
				System.out.println(map.get(j));
	}
	
	public static void printPayramid(int n) {
		
		String seq = "";
		String[] seqArray = new String[n];
		
		for(int i=1; i<=n;i++) {
			if(i == 1) {
				seq = new Integer(i).toString();
			}else {
				seq = "";
				for(int j=0; j<i;j++) {
					seq += new Integer(i+j).toString();
					if(j<i-1) {
						seq = seq+"*";
					}
				}
			}
			seqArray[i-1] = seq;
		}
		
		for(String sq : seqArray) {
			System.out.println(sq);
		}
		for(int x=seqArray.length-1; x>=0;x--) {
			System.out.println(seqArray[x]);
		}
	}
	
	public static void sortArray(int[] arr, int k) {
		
		for(int i=0; i <arr.length-1;i++) {
			for(int j=i+1; j<arr.length-i; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int x : arr) {
			System.out.println(x);
		}
		
	}

}
