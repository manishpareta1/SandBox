package com.examples.string.examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		String s = "abc";
		String s1 = new String("abc").intern();//checks object against string pool if found, point it to pool object else create new one
		String s2 = new String("abc"); //creates object on heap but not in string pool
		System.out.println(s==s1); //true, check for reference 
		System.out.println(s.equals(s2));//true, check for value
		System.out.println(s==s2);//false, both points to different references
		Map m = new HashMap(10,5);
		//Count of each char in a string
		String ss = "Hello Guys,    this is HashMaluhkjhjk  khk hk wetwert qwergwbfwrrthetbwqevq wd cqwdc wefg3tbet bergnnbeg wdwegetytyjtuikmt yyjm5yyn 56yj5tb4ergb3rb4t hk hklh kjhlh  huih lh lkhlkhlk hlkj  hlk hlkh lkh lk hkuh lk hlkj pssss example kjfdjfkl kajdsfdlkj ljdrl;jqwlkejr wejfl;knfvklajsdl;fjlkj f;ewjlkajsdl";
		char[] c = ss.toCharArray();
		
		for(int i=0;i<c.length;i++){
			int count =1;
			if(m.containsKey(c[i])){
			count = (Integer)m.get(c[i]);
			m.put(c[i], count+1);
			}else{
				m.put(c[i], count);
			}
		}
		Set set = m.keySet();
		System.out.println(set.contains('H'));
		System.out.println(m.size()+" | "+m.toString());
		System.out.println("Find Duplicate called");
		findDuplicate(ss);
	}
	
	public static void findDuplicate(String s){
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			for(int j =i+1; j<c.length-1;j++){
				if(c[i] == c[j]){
					System.out.print(c[i]);
					break;
				}
			}
		}
	}
	
}
