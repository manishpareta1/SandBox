package com.examples.logicalprogram;

public class Entry<K, V> {
	
	K key;
	V value;
	Entry left;
	Entry right;
	@Override
	public String toString() {
		return "Entry [key=" + key + ", value=" + value ;
	}
	
	
}
