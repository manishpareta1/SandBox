package com.java8;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "#24/2 8th A Main 8th Cross";
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (char c : ch) {
			Integer i = map.putIfAbsent(c, 1);
			if(i != null) {
				int j = map.get(c);
				map.put(c,++j);
			}
		}
		
		map.forEach((chr,val)->System.out.println(chr+ ": "+val));

	}

}
