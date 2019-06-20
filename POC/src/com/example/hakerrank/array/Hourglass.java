package com.example.hakerrank.array;

/**
 * Problem Statement
 * we are give an arrya of 6X6 and we have to find the sum of elements out of the hourglass 
 * combination and maximum sum from all of the
 * hourglass combinations formed
 * -1 -1 0 -9 -2 -2
   -2 -1 -6 -8 -2 -5
   -1 -1 -1 -2 -3 -4
   -1 -9 -2 -4 -4 -5
   -7 -3 -3 -2 -9 -9
   -1 -3 -1 -2 -4 -5
   -----------------
   hourglass will be 
   
   -1 -1  0    -1  0 -9
      -1          -6 
   -1 -2 -1    -1 -1 -2
 * @author manish.pareta
 *
 */

public class Hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*-1 -1 0 -9 -2 -2
		-2 -1 -6 -8 -2 -5
		-1 -1 -1 -2 -3 -4
		-1 -9 -2 -4 -4 -5
		-7 -3 -3 -2 -9 -9
		-1 -3 -1 -2 -4 -5*/
		int[][] arr = new int[6][6];
		
		arr[0][0] = -1;arr[0][1] = -1;arr[0][2] = 0;arr[0][3] = -9;arr[0][4] = -2;arr[0][5] = -2;
		arr[1][0] = -2;arr[1][1] = -1;arr[1][2] = -6;arr[1][3] = -8;arr[1][4] = -2;arr[1][5] = -5;
		arr[2][0] = -1;arr[2][1] = -1;arr[2][2] = -1;arr[2][3] = -2;arr[2][4] = -3;arr[2][5] = -4;
		arr[3][0] = -1;arr[3][1] = -9;arr[3][2] = -2;arr[3][3] = -4;arr[3][4] = -4;arr[3][5] = -5;
		arr[4][0] = -7;arr[4][1] = -3;arr[4][2] = -3;arr[4][3] = -2;arr[4][4] = -9;arr[4][5] = -9;
		arr[5][0] = -1;arr[5][1] = -3;arr[5][2] = -1;arr[5][3] = -2;arr[5][4] = -4;arr[5][5] = -5;
		/*for(int i=0; i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				arr[i][j] = j;
			}
		}
		
		for(int i=0; i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("\n");
		}
		System.out.println(arr.length);*/
		
		System.out.println("Max hourglass sum is"+hourglassSum(arr));

	}
	
	public static int hourglassSum(int[][] arr){
		 
		 int temp =0;
	       
	        for(int i=0;i<arr.length-2;i++){
	            for(int j=0;j<arr.length-2;j++){
	            	 int sum = 0;
	                sum = arr[i][j] +arr[i][j+1]+arr[i][j+2];
	                sum = sum+arr[i+1][j+1];
	                sum = sum+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
	                System.out.print(sum +" | ");
	                if(i==0 && j==0)
	                	temp=sum;
	                if(sum>temp)
	                	temp = sum;
	            }
	            System.out.println(" \n ");
	        }
	        
	        return temp;
	    }


}
