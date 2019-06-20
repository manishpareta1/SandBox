package com.example.hakerrank.array;

public class InsertInSortedDublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLinkedList head = new DLinkedList();
		head.data = 10;
		
		for(int i=0;i<4;i++) {
			DLinkedList newNode = new DLinkedList();
			newNode.data = (int) (Math.random()*10 +1);
			insertNode(head, newNode);
		}
		
		
		
		int count = traverseCout(head);
		

	}
	
	public static int traverseCout(DLinkedList head) {
		int count =1;
		
		if(head == null)
			return 0;
		if(head.next == null) {
			System.out.println(head.data);
			return 1;
		}
		DLinkedList temp = head;
		while(temp.next != null){
			System.out.println(temp.data);
			temp=temp.next;
			count++;
			
		}
		return count;
		
	}
	
	public static DLinkedList insertNode(DLinkedList head, DLinkedList newNode) {
		
		if(head== null)
			return newNode;
		if(head.next == null) {
			head.next = newNode;
			newNode.pre = head;
			return head;
		}
		DLinkedList temp= head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next=newNode;
		newNode.pre =temp;
		return head;
	}
	
	public DLinkedList mergeSort(int count, DLinkedList headNode) {
		
		int headPosition = 1;
		int middlePosition = count/2;
		
		
		
		
		
		
		
		return headNode;
	}
	
	public DLinkedList getNodeAtGivenPosition(DLinkedList head, int position) throws Exception{
		
		if(head == null)
			return head;
		if(head.next == null && position>1)
			throw new Exception();
		
		DLinkedList temp = head;
		for(int i=0;i<position;i++) {
			temp = temp.next;
		}
		return temp;
	}

}

class DLinkedList{
	
	public DLinkedList next;
	public DLinkedList pre;
	public int data;
	
}
