package com.examples.dataStructure.linkedList;

public class TraverseLinkedList {

	public TraverseLinkedList() {
		// TODO Auto-generated constructor stub

	}


	/*
	 * Add element in LinkedList
	 * @param headNode and newNode
	 * @return headNode
	 */
	public Node add(Node headNode, Node newNode){
System.out.println("in add"+newNode.getData());
		if(headNode == null){
			/*headNode = new Node();
			headNode.setData(newNode.getData());
			headNode.setNext(newNode.getNext());*/
			System.out.println(newNode.toString());
			return newNode;
		}else{

			Node tempNode = headNode;
			while(tempNode.getNext() != null){
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(newNode);
			newNode.setPrevious(tempNode);
		}
		System.out.println(newNode.toString());
		return headNode;
	}

	/*
	 * Traversing LinkedList
	 * @param headNode
	 * @return count of element
	 */
	public int traverse(Node headNode){
		System.out.println("*********************Traversing List*********************");
		int i=0;
		if(headNode == null){
			System.out.println("No Element found");
		}else{
			Node tempNode = headNode;
			while(tempNode.getNext() != null){
				System.out.println("Node Data at index: "+i + " is = "+tempNode.getData());
				i++;
				tempNode = tempNode.getNext();
			}
			if(tempNode.getNext() == null){
				System.out.println("Node Data at index: "+i + " is = "+tempNode.getData());
			}
		}
		return i;
	}

	/*
	 * Insert at first Index
	 * @param headNode and New Node
	 * @return headNode
	 */
	public Node insetAtFirst(Node headNode, Node newNode){
		System.out.println("*********************Inside InsertAtFirst*********************");
		if(headNode == null){
			return newNode;
		}else {
			newNode.setNext(headNode);
			return newNode;
		}
	}

	/*
	 * Insert at last Index
	 * @param headNode and New Node
	 * @return headNode
	 */

	public Node insetAtLast(Node headNode, Node newNode){
		System.out.println("****************Inside InsertAtLast*********************");
		if(headNode == null){
			return newNode;
		}else {
			Node tempNode = headNode;
			while(tempNode.getNext() != null){
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(newNode);
			return headNode;
		}
	}

	/*
	 * Insert at specific Index
	 * @param index and headNode and New Node
	 * @return headNode
	 */
	public Node insertAtIndex(int index, Node headNode, Node newNode){
		System.out.println("*********************Inside InsertAtIndex*********************");
		if(headNode == null){
			System.out.println("No Element found in List hence placing it at 1st position");
			return newNode;
		}else if(headNode != null && headNode.getNext() == null){
			System.out.println("Only one element found in the list so adding it at in the end");
			headNode.setNext(newNode);
		}else{
			int j = traverse(headNode);
			if(j+1 < index){
				System.out.println("Invalid index: "+ index +". Current size of List is: "+ j );
				return headNode;
			} else{
				Node tempNode = headNode;
				int count =0;
				while(tempNode.getNext() != null && count+1 < index){
					tempNode = tempNode.getNext();
					count++;
				}
				newNode.setNext(tempNode.getNext());
				tempNode.setNext(newNode);
			}
			return headNode;
		}
		return headNode;
	}


	/*
	 * Delete at first Index
	 * @param headNode
	 * @return headNode
	 */
	public Node deleteAtFirst(Node headNode){
		System.out.println("*********************Inside DeleteAtFirst*********************");
		if(headNode == null){
			System.out.println("Nothing to Delete, List is empty");
			return headNode;
		}else if(headNode.getNext() == null){
			System.out.println("List has only one Element which is deleted too: "+ headNode.getData());
			headNode = null;
			return headNode;
		}else{
			System.out.println("Removing Element: "+ headNode.getData());
			headNode = headNode.getNext();
			return headNode;
		}
	}

	/*
	 * Delete at specific Index
	 * @param headNode and index
	 * @return headNode
	 */
	public Node deleteAtIndex(Node headNode, int index){
		System.out.println("*********************Inside DeleteAtIndex*********************");
		if(headNode == null){
			System.out.println("Nothing to Delete, List is empty");
			return headNode;
		}else if(headNode.getNext() == null){
			System.out.println("List has only one Element which is deleted too: "+ headNode.getData());
			headNode = null;
			return headNode;
		}else{
			Node tempNode = headNode;
			int count = 0;
			while(tempNode.getNext() != null && count+1 < index){
				tempNode = tempNode.getNext();
				count++;
			}
			System.out.println("Removing Element: "+ tempNode.getNext().getData() + " found at index: "+ index);
			tempNode.setNext(tempNode.getNext().getNext());
			return headNode;
		}
	}

	/*
	 * Reverse LinkedList
	 * @param headNode and index
	 * @return headNode
	 */

	public Node reverseLinkedList(Node headNode){
		System.out.println("*********************Inside ReverseLinkedList*********************");
		if(headNode == null){
			System.out.println("No Element found in list");
		}
		Node current, previous=null, next = null;
		current = headNode;
		while(current != null){
			next = current.getNext();
			current.setNext(previous);
			previous = current;
			current = next;
		}

		return previous;
	}

// Detect cycle in a linked list
	public void detectCycleinLinkedList(Node headNode){
		if(headNode == null){
			System.out.println("No element found in linked list");
		}if( headNode.getNext() == null){
			System.out.println("List has only one Element: "+headNode.getData());
		}if(headNode.getNext() != null){
			Node temp = headNode;
			Node oneStepNode = headNode;
			Node twoStepNode = headNode.getNext().getNext();
			int iteration = 0;
			while(temp.getNext() != null ){
				if(oneStepNode.getData() == twoStepNode.getData()){
					System.out.println("Cycle Found in Provided linked list in iteration no: "+iteration);
					break;
				}else{
					temp = temp.getNext();
					oneStepNode = oneStepNode.getNext();
					twoStepNode = twoStepNode.getNext().getNext();
				}
				iteration++;
			}
		}
	}


	public static void main(String[] args){

		TraverseLinkedList linkedList = new TraverseLinkedList();
		Node n = null;
		Node head = null;

		for(int i=0; i<10; i++){
			n = new Node();
			n.setData("Manish"+i);
			n.setNext(null);
			head = linkedList.add(head, n);
		}

		linkedList.traverse(head);
		n = new Node();
		n.setData("ManishNew");
		n.setNext(null);
		//Insert at Index
		linkedList.insertAtIndex(4, head, n);
		linkedList.traverse(head);

		n = new Node();
		n.setData("ManishFirst");
		n.setNext(null);
		//Insert at first
		head = linkedList.insetAtFirst(head, n);
		linkedList.traverse(head);

		linkedList.deleteAtIndex(head, 5);
		linkedList.traverse(head);
		
		linkedList.getMiddleNode(head);
		
		head = linkedList.reverseLinkedList(head);
		linkedList.traverse(head);

		
		
		Node node = null;
		Node newhead = null;

		for(int i=0; i<10; i++){
			node = new Node();
			node.setData("Manish"+i);
			node.setNext(null);
			newhead = linkedList.add(newhead, node);
		}
		node = new Node();
		node.setData("Cycle");
		node.setNext(newhead);
		newhead = linkedList.add(newhead, node);
		linkedList.detectCycleinLinkedList(newhead);
	}
	
	
	public Node getMiddleNode(Node head){
		
		if(head == null){
			System.out.println("No node found");
			return head;
		}if(head.getNext() == null){
			System.out.println("Only one node found: "+head.getData());
			return head;
		}
		
		Node temp1 = head;
		Node temp2 = head;
		while(temp2 != null && temp2.getNext() != null){
			temp1 = temp1.getNext();
			temp2 = temp2.getNext().getNext();
		}
		System.out.println("Middle Node is: "+temp1.getData());
		return head;
	}
	
	public Node flattenLinkedList(Node head){
		
		if(head== null ){
			System.out.println("No Element found");
			return head;
		}if(head.getNext() == null ){
		System.out.println();
		return head;
		}
		Node temp = head;
		Node temp1 = head;
		
		while(temp.getNext() != null){
			
			while(temp1.getPrevious() != null){
				temp1 = temp1.getPrevious(); 
			}
			temp1.setPrevious(temp.getNext());
			temp = temp.getNext();
		}
		
		return head;
	}
	
}
