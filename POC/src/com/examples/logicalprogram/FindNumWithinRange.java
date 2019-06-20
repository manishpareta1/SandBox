package com.examples.logicalprogram;

public class FindNumWithinRange {

	public FindNumWithinRange() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int foundCounter = 0;
		int[] arr = {3,10,12,11,13,14,15,16,17,18,19,20,22};
		for(int i = a;i<=b;i++){
			for(int j =0;j<arr.length;j++){
				if(arr[j] == i){
					foundCounter += 1;
				}
			}
		}
		if(foundCounter == (b-a+1))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
