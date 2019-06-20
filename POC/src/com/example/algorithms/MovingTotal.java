package com.example.algorithms;

import java.util.ArrayList;
import java.util.List;

public class MovingTotal {
    /**
    /**
     * Adds/appends list of integers at the end of internal list.
     */
	private List<Integer> countList = new ArrayList<Integer>();
    public void append(int[] list) {
        for(int i=0;i<list.length;i++){
        	countList.add(list[i]);
        }      
    }
    
    public static void print(boolean b) {
    	System.out.println(b);
    	}

    /**
     * Returns boolean representing if any three consecutive integers in the
     * internal list have given total.
     */
    public boolean contains(int total) {
    	int count = 0;
    	if(countList.size()<3)
    		return false;
    	else{
    		for(int j=0;j<3;j++){
    			count += countList.get(countList.size()-j-1);
    		}
    		if(count == total)
    			return true;
    		else{
    			return false;
    		}
    	}
    }

    public static void main(String[] args) {
        MovingTotal movingTotal = new MovingTotal();

        movingTotal.append(new int[] { 1, 2, 3 });
        movingTotal.print(movingTotal.contains(6));
        System.out.println(movingTotal.contains(6));
        System.out.println(movingTotal.contains(9));

        movingTotal.append(new int[] { 4 });

        System.out.println(movingTotal.contains(9));
    }
}