package com.examples.string.examples;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Substring {

	public Substring() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		/* String s = "Manish Pareta";
	 String zip = "8878899-323232";
	 zip = zip.replaceAll("[^0-9-0-9]", "");
	 System.out.println(zip);
	 boolean isValid = false;
	 String countryCd = "US";
	 Pattern pattern = Pattern.compile("[0-9-]*");

     String str = "123456-333";
     Matcher matcher = pattern.matcher(str);

     if (!matcher.matches()) {
          System.out.println("string '"+str + "' contains special character");
     } else {
          System.out.println("string '"+str + "' doesn't contains special character");
     }

	 System.out.println(zip + " : "+isValid);

	 isValidAddress("US", "ABC", "12345-1234");*/
		/*double rate = 123.4556;
		double fromExchangeRate =18681527512.36; //LKR
		double toExchangeRate = 19.6240576698; //CZK
		double converted = 0.0;

		converted = toExchangeRate/fromExchangeRate*rate;
		BigDecimal bd = BigDecimal.valueOf(converted);
		System.out.println(bd.toString());*/
		
		

	}

	public static String subStr(String s, int start, int end){
		char[] c = s.toCharArray();
		String str ="";
		for(int i=start; i<end; i++ ){
			str += c[i];
		}

		return str;
	}
	
	public static String subStr2(String s, int start, int end){
		String str ="";
		for(int j=start;j<end; j++) {
			
		}
		
		
		
		return str;
	}

	public static boolean isValidAddress1(String countryCd, String stateCd, String zipCode) {
		//TODO .. Please use this method in reservation flow as well 
		boolean isValidAddress = false;
		//TGCache tgCache =  new TGCache();
		boolean stateCdCountryCdMatched = true;//tgCache.isStateCdCountryCdMatched(countryCd, stateCd);
		if (stateCdCountryCdMatched){
			if(!isValidZipCode(zipCode)){
				//zipCode = zipCode.replaceAll("[^0-9-0-9]", ""); // Removing special Chars 
				isValidAddress = false;
			}else{
				if(countryCd.equals("US") ){
					if(zipCode.contains("-")){
						if(zipCode.length() == 10 && zipCode.charAt(5) == '-'){
							isValidAddress = true;
							System.out.println("Perfect Zip Code: "+ isValidAddress);
						}else if(zipCode.indexOf('-') >=5){// should be always 5 before -
							zipCode = zipCode.substring(0, 5);
							isValidAddress = true;
							System.out.println("Zip Code with -, new Zip: "+zipCode);
						}
					}
				}else 	if (zipCode.matches("[0-9]+")
						&& (zipCode.length() >= 5 && zipCode.length() <= 9)) {
					isValidAddress = true;
					System.out.println("Not US and Zip doesnt Contains -");
				}
			}
		}else if (true) {
			System.out.println("default true");
			isValidAddress = true;
		}
		System.out.println("Is valida address: "+isValidAddress);
		return isValidAddress;
	}

	public static boolean isValidAddress(String countryCd, String stateCd, String zipCode) {
		//TODO .. Please use this method in reservation flow as well 
		boolean isValidAddress = false;
		//TGCache tgCache =  new TGCache();
		boolean stateCdCountryCdMatched = true;//tgCache.isStateCdCountryCdMatched(countryCd, stateCd);
		if (stateCdCountryCdMatched){
			if(isValidZipCode(zipCode)){
				if(countryCd.equals("US") ){
					if(zipCode.contains("-")){
						if(zipCode.length() == 10 && zipCode.charAt(5) == '-'){
							isValidAddress = true;
						}else if(zipCode.indexOf('-') >=5){// should be always 5 before -
							zipCode = zipCode.substring(0, 5);
							isValidAddress = true;
						}
					}
				}else 	if(zipCode.matches("[0-9]+") && (zipCode.length() >= 5 && zipCode.length() <= 9)) {
					isValidAddress = true;
				}
			}
		}else if (true) {
			isValidAddress = true;
		}
		return isValidAddress;
	}

	public static boolean isValidZipCode(String s){
		Pattern pattern = Pattern.compile("[0-9-]*");
		Matcher matcher = pattern.matcher(s);
		return matcher.matches();
	}

	public static String subStrNew(String str, int startIndex, int endIndex) {
		String subStr = "";
		
		String[] strArr = str.split("");
		for(int i =startIndex; i<endIndex;i++) {
			subStr = subStr.concat(strArr[i]);
		}
		return subStr;
	}


}
