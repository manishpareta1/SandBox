package com.examples.string.examples;

import java.util.Calendar;


public class StringPatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "asdfasdfasdfasdfasdfasdfjlsdjklsdasdfasdjkl";
		String pattern = "asd";
		long start = Calendar.getInstance().getTimeInMillis();
		System.out.println("No of Occurance of pattern: "+matchPattern(string, pattern));
		long end = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time taken: "+ (end-start));
		
	}
	
	public static int matchPattern(String string, String pattern) {

		char[] strChar = string.toCharArray();
		char[] ptrnChar = pattern.toCharArray();

		int count = 0;
		for(int i=0;i<(strChar.length-1)-ptrnChar.length;i++) {
			boolean flag = false;
			if(ptrnChar[0] == strChar[i] && ptrnChar[ptrnChar.length-1] == strChar[i+ptrnChar.length-1]){
				for(int j =1;j<ptrnChar.length-1;j++) {
					if(ptrnChar[j] !=strChar[i+j]) {
						flag = false;
						break;
					}else {
						flag = true;
					}
				}
			}
			if(flag == true)
				++count;
		}
		Runtime.getRuntime().gc();
		return count;
	}
}

