package com.examples.collections.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastAndFailSafeIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> iList = new ArrayList<>();
		iList.add(1);
		iList.add(2);
		iList.add(3);
		iList.add(4);
		
		Iterator itr = iList.iterator();

		while(itr.hasNext()) {
			int i = (Integer) itr.next();
			System.out.println(i);
			if(i == 2) {
				itr.remove(); //Works fine, remove on Iterator's method is allowed.
			}
		}
		
		while(itr.hasNext()) {
			int i = (Integer) itr.next();
			System.out.println(i);
			if(i == 2) {
				iList.remove(2); //Fail Fast, remove/add (structural change on collection) is not allowed
			}
		}
		
		//HashMap and all concurrent collections are Fail Safe iterators, while iterating over them they uses clone/view of the
		//actual collection to iterate
		
		System.out.println(iList);
	}

}
