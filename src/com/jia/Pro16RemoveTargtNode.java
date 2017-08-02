package com.jia;


/*
 * Time:O(n)
 * Space:O(1)
 */
public class Pro16RemoveTargtNode {
	class Node {
		public int value;
		public Node next;
		private Node previous;
	}
	public static void removeTargetNode(Node head, int target) {
		Node current = head;
		while(current != null) {
			if(current.value == target) {
				if(current.next != null) 
					current.next.previous = current.previous;
				if(current.previous != null) 
					current.previous.next = current.next;
				break;
			}
			current = current.next;
		}
	}
}
