package com.examples.logicalprogram;

public class DrawPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		starPattern(8);
		reverseStarPattern(3);
		

	}
	
	
	
	//Draw * Pattern
	
/*#1.
 * 		*
 * 	   ***
 *    *****
 *   *******
 */
	
	public static void starPattern(int n){
		
		int maxStars = 2*n-1;
		int factor = 0;
		
		for(int i = 0; i<n; i++){
			
			for(int j = 0; j<(maxStars/2); j++){
				System.out.print(" ");
			}
			for(int k =0;k<=factor;k++){
				System.out.print("*");
			}	
			for(int j = 0; j<(maxStars/2); j++){
				System.out.print(" ");
			}
			System.out.print("\n");
			maxStars = maxStars-2;
			factor = factor +2;
		}
		
	}
	
public static void reverseStarPattern(int n){
		
		int factor  = 2*n-1;
		int maxStars = 0;
		
		for(int i = n; i>0; i--){
			
			for(int j = maxStars; j>0; j--){
				System.out.print(" ");
			}
			for(int k =factor;k>0;k--){
				System.out.print("*");
			}	
			for(int j = maxStars; j>0; j--){
				System.out.print(" ");
			}
			System.out.print("\n");
			maxStars = (maxStars+2)/2;
			factor = factor -2;
		}
		
	}

}
class CirclePattern extends DrawPattern{
	
	public void reverseStartPattern(int i){
		
	}
}
