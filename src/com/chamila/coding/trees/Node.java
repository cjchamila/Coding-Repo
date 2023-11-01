package com.chamila.coding.trees;

public class Node<T> {
	private Node<T>left;
	private Node<T>right;
	private int data;
	
	public Node(int data){		
		this(null,null,data);
	}
	
	public Node(Node left,Node right,int data) {
		this.left=left;
		this.right=right;
		this.data=data;
	}

}
