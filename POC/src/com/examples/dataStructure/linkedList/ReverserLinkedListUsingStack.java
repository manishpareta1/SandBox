package com.examples.dataStructure.linkedList;

public class ReverserLinkedListUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraverseLinkedList tl = new TraverseLinkedList();
		Node headNode = null;
		for(int i=0;i<5;i++) {
			Node n = new Node();
			n.setData("Node"+i);
			headNode = tl.add(headNode, n);
		}
		
		ReverserLinkedListUsingStack reverserList = new ReverserLinkedListUsingStack();
		System.out.println(">>>>>>>>>>>>>>>> Before Reverse>>>>>>>>>>>>>>>");
		tl.traverse(headNode);
		System.out.println(">>>>>>>>>>>>>>>> After Reverse>>>>>>>>>>>>>>>");
		//Node nNode = reverserList.reverseUsingStack(headNode);
		NodeStack ns = new NodeStack(reverserList.reverseUsingStack(headNode));
		System.out.println("Pop elements after reverse: ");
		while(ns.getNode().getNext() != null) {
			System.out.print(ns.pop().getData()+", ");
		}
		System.out.print(ns.pop().getData());
		//tl.traverse(reverserList.reverseUsingStack(headNode));
		
		
		

	}
	
	
	public Node reverseUsingStack(Node headNode) {
		
		NodeStack nStack = new NodeStack(null);
		if(headNode == null) {
			System.out.println("No element found in the list");
			return null;
		}
		if(headNode.getNext() == null) {
			System.out.println("***Reverse List is***");
			System.out.println(headNode.getData());
			headNode.setNext(null);
			return headNode;
		}
	
		
		while(headNode.getNext() != null) {
			Node temp = new Node();
			temp.setData(headNode.getData());
			headNode = headNode.getNext();
			nStack.push(temp);
		}
		Node temp = new Node();
		temp.setData(headNode.getData());
		nStack.push(temp);
		
		return nStack.getNode();
		
	}

}

class NodeStack{
	
	private Node node;

	public NodeStack(Node node) {
		super();
		this.node = node;
	}
	
	
	public Node getNode() {
		return node;
	}


	public void setNode(Node node) {
		this.node = node;
	}


	public boolean isEmpty() {
		
		if(this.node == null)
			return true;
		else
			return false;
	}
	
	public void push(Node newNode) {
		
		if(isEmpty()) {
			this.node = new Node();
			this.node.setData(newNode.getData());
		}
		else {
			newNode.setNext(this.node);
			this.node.setPrevious(newNode);
			this.node = newNode;
		}
	}
	
	public Node pop() {
		Node temp = new Node();
		if(isEmpty()) {
			return null;
		}else {
			temp = this.node;
			this.node = this.node.getNext();
			return temp;
		}
	}
}
