package com.examples;

public class Palindrome {
	
	public boolean checkPalindrome(String string){
		
		int length = string.length();
		int middle = length/2;
		boolean isPalendrome = false;
		for(int i=0; i<middle; i++){
			if(string.charAt(i) == string.charAt(length)){
				isPalendrome = true;
			}else{
				isPalendrome = false;
			}
		}
		
		return isPalendrome;
	}
	

}
