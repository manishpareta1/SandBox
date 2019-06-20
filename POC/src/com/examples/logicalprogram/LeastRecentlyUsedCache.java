package com.examples.logicalprogram;

import java.util.HashMap;
import java.util.Map;

/**
 * This is a way to implement cache but it will not achieve the objective
 * HashMap doesnt work correctly in this requirement because it maintaines Entry<K,V>
 * at every key inserted in Map. hence the elements are never in a sequence
 * Ex - We want to store elements like 1->2->3->4->5
 * but hashmap stores them in 
 * 1->1
 * 2->2
 * 3->3
 * 4->4
 * Here we cant determine which value was inserted at first and last.
 * We should prefere Other DS to implement it like DQueue
 * @author manish.pareta
 *
 * @param <K>
 * @param <V>
 */
public class LeastRecentlyUsedCache<K, V> {
	
	private final int CACHE_SIZE;
	private final Map<K, Entry<K,V>> CACHE;
	
	private Entry<K,V> head, tail;

	public LeastRecentlyUsedCache(int size) {
		super();
		CACHE_SIZE = size;
		CACHE = new HashMap<K, Entry<K, V>>();
	}

	public void addToCache(K key, V value) {
		if(CACHE.containsKey(key)) {
			Entry<K,V> entry = CACHE.get(key);
			entry.value = value;
			remove(entry);
			moveEntryToTop(entry);
		}else {
			Entry<K,V> entry = new Entry<K,V>();
			entry.key = key;
			entry.value = value;
			if(CACHE_SIZE == CACHE.size()) {
				CACHE.remove(tail.key);
				remove(tail);
				System.out.println(CACHE);
			}
			
			moveEntryToTop(entry);
			CACHE.put(key, entry);
		}
	}
	
	public V getEntryFromCache(K key, V value){
		Entry<K, V> entry = new Entry<K, V>();
		if(CACHE.containsKey(key)) {
			entry = CACHE.get(key);
			if(!entry.equals(head)) {
				remove(entry);
				moveEntryToTop(entry);
			}
		}
		return entry.value;
	}
	
	private void moveEntryToTop(Entry<K, V> entry) {
		// TODO Auto-generated method stub
		entry.right = head;
		if(head != null) {
			head.left = entry;
		}
		head = entry;
		if(tail == null) {
			tail = head;
		}

	}
	public void remove(Entry entry) {
		
			if(entry.left != null) {
				entry.left.right = entry.right;
			}else {
				head = entry.left;
			}
			
			if(entry.right != null) {
				entry.right.left = entry.left;
			}else {
				tail = entry.right;
			}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeastRecentlyUsedCache<Integer, String> lruCache = new LeastRecentlyUsedCache<>(4);
		
		lruCache.addToCache(1, "Manoj");
		lruCache.addToCache(2, "Manish");
		lruCache.addToCache(3, "Nikhil");
		lruCache.addToCache(4, "Piyush");
		
		lruCache.getEntryFromCache(3, "Nikhil");
		lruCache.getEntryFromCache(2, "Manish");
		lruCache.getEntryFromCache(1, "Manoj");
		lruCache.addToCache(5, "Kabir");
		
	}

}
