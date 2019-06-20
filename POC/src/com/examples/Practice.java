package com.examples;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node("Head_Node", null, null);
		for(int i=1;i<= 7; i++){
			Node newNode = new Node("Node_"+i, null, null);
			head = addNode(head, newNode);
		}
		System.out.println("total length: "+traverseNode(head));
		
		deleteAlternateNode(head);
		
	}
	
	public static int traverseNode(Node headNode){
		
		int count =0;
		if(headNode == null){
			System.out.println("No Data found, head node is null ");
			return 0;
		}
		if(headNode.getNextNode() == null){
			System.out.println("Data: "+headNode.getData());
			return count++;
		}
		//Node tempNode = new Node(headNode.getData(), headNode.getNextNode(), headNode.getPreviousNode());
		Node tempNode = headNode;
		while(tempNode.getNextNode() != null){
			System.out.println("Data: "+tempNode.getData());
			tempNode = tempNode.getNextNode();
			count++;
		}
		System.out.println("Data: "+tempNode.getData());	
		return count++;
	}
	
	public static Node addNode(Node headNode, Node newNode){
		
		if(headNode == null){
			return newNode;
		}
		if(headNode.getNextNode() == null){
			headNode.setNextNode(newNode);
			return headNode;
		}
		//Node tempNode = new Node(headNode.getData(), headNode.getNextNode(), headNode.getPreviousNode());
		Node tempNode = headNode;
		while(tempNode.getNextNode() != null){
			tempNode = tempNode.getNextNode();
		}
		tempNode.setNextNode(newNode);		
		return headNode;
	}
	
	public static void deleteAlternateNode(Node headNode){
		
		if(headNode == null){
			return;
		}
		Node prev = headNode;
		Node nextNode = headNode.getNextNode();
		
		
		while(prev != null && nextNode != null){	
			prev.setNextNode(nextNode.getNextNode());
			System.out.println("Deleting Node:"+ nextNode.getData());
			nextNode = null;
			
			prev = prev.getNextNode();
			if(prev !=null)
				nextNode = prev.getNextNode();
			
		}
	}

}

class Node{
	
	private String data;
	private Node nextNode;
	private Node previousNode;
	
	public Node(){
		super();
	}
	
	public Node(String data, Node nextNode, Node previousNode){
		this.data = data;
		this.nextNode = nextNode;
		this.previousNode = previousNode;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
	
	
}
