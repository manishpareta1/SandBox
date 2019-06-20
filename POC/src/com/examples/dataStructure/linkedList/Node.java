package com.examples.dataStructure.linkedList;

public class Node {
	
	private String data;
	private Node next;
	private Node previous;

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node down) {
		this.previous =down;
	}
	
	
	public String toString(){
		
		return this.data;
	}
	

}
