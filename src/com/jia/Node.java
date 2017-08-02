package com.jia;

public class Node {
	public int data;
	public Node next;
	public Node(int data) {
		this(data, null);
	}
	
	public Node(int data, Node node) {
		this.data = data;
		this.next = node;
	}
}
