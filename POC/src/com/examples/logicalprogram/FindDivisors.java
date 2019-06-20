package com.examples.logicalprogram;

import java.util.Scanner;

public class FindDivisors {

	public FindDivisors() {
		// TODO Auto-generated constructor stub
	}
	

		public static void main (String[] args) {
			//code
			Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
			
			int total = 0;
			for(int j=1;j<=t;j++){
				int divisor = 0;
			for(int i=1;i<=j;i++){
			    if(j%i == 0){
			        divisor += 1;
			        
			    }
			}
			if(divisor == 9){
				System.out.println(j);
			    total += 1;
			   
			}
			}
			 System.out.println(total);
			
		}


}


