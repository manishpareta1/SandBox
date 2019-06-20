package com.examples.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final int  count1 = 0;
		int count = 0;
		Pattern p = Pattern.compile("ab", 3);
		Matcher m = p.matcher("ababasbsbbsasnbababab");
		while(m.find()){
			++count;
			System.out.println(m.start()+"..."+m.end()+"..."+m.group());
		}
		System.out.println("Count: "+count);
		
	}

}
