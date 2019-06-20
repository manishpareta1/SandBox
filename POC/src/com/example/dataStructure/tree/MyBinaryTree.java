package com.example.dataStructure.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MyBinaryTree {

	TreeNode root;

	public void add(int value) {
		root = addRecursive(root, value);
		//root = addTreeNode(new TreeNode(value));
	}

	public boolean containsNode(int value){
		return containsNodeRecursive(root, value);
	}

	public void inOrder(){
		inOrderTraversal(root);
	}
	public void preOrder(){
		preOrderTraversal(root);
	}
	public void postOrder(){
		postOrderTraversal(root);
	}
	
	public int getHight(){
		return getHight(root);
	}
	
	public void levelOrderTraversal(){
		levelOrderTraversal(root);
	}
	
	public void deleteElements(int i){
		deleteElement(i);
	}
	/*
	 * private TreeNode addTreeNode(TreeNode node) {
	 * 
	 * if(this.root == null) { return this.root = node; }
	 * 
	 * TreeNode temp = new TreeNode(this.root.value); while(temp != null) {
	 * if(node.value > temp.value) temp = temp.right; else if(node.value <
	 * temp.value){ temp = temp.left; } }
	 * 
	 * temp = node;
	 * 
	 * 
	 * return this.root; }
	 */

	private TreeNode addRecursive(TreeNode current, int value) {
		if (current == null) {
			return new TreeNode(value);
		}
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		} else {
			// value already exists
			return current;
		}
		return current;
	}

	private boolean containsNodeRecursive(TreeNode current, int value) {
		if (current == null) {
			return false;
		} 
		if (value == current.value) {
			return true;
		} 
		return value < current.value
				? containsNodeRecursive(current.left, value)
						: containsNodeRecursive(current.right, value);
	}

	private void inOrderTraversal(TreeNode current){
		if(current != null){
			inOrderTraversal(current.left);
			System.out.print(current.value);
			inOrderTraversal(current.right);
		}
	}

	private void preOrderTraversal(TreeNode current){
		if(current != null){
			System.out.print(current.value);
			preOrderTraversal(current.left);
			preOrderTraversal(current.right);
		}
	}

	private void postOrderTraversal(TreeNode current){
		if(current != null){
			postOrderTraversal(current.left);
			postOrderTraversal(current.right);
			System.out.print(current.value);
		}
	}
	
	/*
	 * Height of a tree is the length of the root node from its deepest child.
	 * Using recursion it is easy to get the height of a tree
	 * Traverse the Left sub tree and right sub tree and take the max of both +1 will
	 * give the height of root node.
	 * If we are considering no of edges b/w root and the deepest leaf node, then we should
	 * return -1 from for leaf node height
	 * if we are considering no of nodes from root to leaf node the we should return 0
	 * We are adding 1 in so that at every iteration we will have the correct level of nodes
	 */
	private int getHight(TreeNode root) {
		int height = 0 ;
		int leftTreeHight = 0;
		int rightTreeHight = 0;
		
		if(root == null)
			return -1;
		
		leftTreeHight = getHight(root.left);
		rightTreeHight = getHight(root.right);
		
		height = (leftTreeHight >= rightTreeHight ? leftTreeHight : rightTreeHight ) +1;
		
		return height;
	}
	
	/*
	 * level order travels is Breadth First Search implementation
	 * we are using a q here to read all the elements of tree level wise.
	 * Approach here is to 
	 * 1. push first element in Q,
	 * 2. pop that element and push its child back in Q.
	 * 3. print the current element and remove it from Q
	 * 4. and repeat step 2-3 till Q is empty
	 */
	private void levelOrderTraversal(TreeNode root) {
		
		if(root == null)
			return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode node = q.peek();
			System.out.print(node.value+",");
			if(node.left != null)
				q.add(node.left);
			if(node.right != null)
				q.add(node.right);
			q.poll();
			//System.out.println(q.poll().value);
		}
	}
	
	private void deleteElement(int value) {
		
		if(root == null) {
			System.out.println("No such element found");
		}
		TreeNode temp = root;
		TreeNode parentNode = root;
		boolean leftChild = false;
		boolean rightChild = false;
		while(temp != null) {
			
			if(value<temp.value) {
				parentNode = temp;
				temp = temp.left;
				leftChild = true;
				rightChild = false;
			}
			else if(value>temp.value) {
				parentNode = temp;
				temp = temp.right;
				rightChild = true;
				leftChild = false;
			}
			else if(value == temp.value) {
				/*
				 * leftChild = false; rightChild = false;
				 */
				break;
			}
		}
		
		if(temp == null) {
			System.out.println("Element not found");
		}
		if(temp != null && temp.left == null && temp.right == null) {
			System.out.println("Element removed successfully");
			if(rightChild)
				parentNode.right = null;
			if(leftChild)
				parentNode.left = null;
			temp = null;
		}
		
		if(temp != null && temp.left != null && temp.right == null) {
			System.out.println("Element removed successfully");
			if(rightChild)
				parentNode.right = temp.left;
			if(leftChild)
				parentNode.left = temp.left;
			temp = null;
		}
		
		if(temp != null && temp.left == null && temp.right != null) {
			System.out.println("Element removed successfully");
			if(rightChild)
				parentNode.right = temp.right;
			if(leftChild)
				parentNode.left = temp.right;
			temp = null;
		}
		
		if(temp != null && temp.left != null && temp.right != null) {
			System.out.println("Element removed successfully");
			TreeNode newTemp = temp.left;
			parentNode.right = temp.right;
			addRecursive(parentNode.right, newTemp.value);
		}
		levelOrderTraversal(root);
	}
}


