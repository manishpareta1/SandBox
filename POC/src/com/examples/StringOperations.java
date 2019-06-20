package com.examples;

public class StringOperations {

	public static String[] findSubSequence(String s){
		
		if("".equals(s)){
			String[] smallarr= {""};
			return smallarr;
		}
		
		String[] smallarr = findSubSequence(s.substring(1));
		String[] ansArr = new String[smallarr.length*2];
		
		for(int i=0; i<smallarr.length;i++){
			ansArr[i] = smallarr[i];
		}
		for(int j=0; j<smallarr.length;j++){
			ansArr[j+smallarr.length] = s.charAt(0) + smallarr[j];
		}
		
		return ansArr;
	}
	
	public static void reverseString(String s){
		String revString ="";
		char[] c = s.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			revString +=c[i];
		}
		System.out.println("Reverse by converting string to charArr "+revString);
		for(int i=c.length-1;i>=0;i--){
			revString +=s.charAt(i);
		}
		System.out.println("Reverse by charAt(index) method "+revString);
		
		
	}
	
	public static char[] reverseStringRecursion(char[] c, int i, int k){
		if(i== c.length){
			return c;
		}
		reverseStringRecursion(c,i+1,k);
		
		if(k<=i){
			char temp = c[i];
			c[i] = c[k];
			c[k++] = temp;
		}	
		
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "MAN";
		String[] subSeqArr = findSubSequence(str);
		for(String a: subSeqArr){
			System.out.println(a);
		}
		
		reverseString("String Reverse");
		
		System.out.println(reverseStringRecursion(str.toCharArray(),0,0));	
	}

}
