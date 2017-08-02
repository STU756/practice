package com.jia;

public class Pro18AddLinkedListNumbers {
	/**
	 * Time:O(n)
	 * Space:O(n)
	 * @param first
	 * @param second
	 * @return
	 */
	public static Node addLinkedListNumbers(Node first, Node second) {
		int carry = 0;
		Node dummy = new Node(-1);
		Node p = dummy;
		while(first!= null || second != null) {
			int x = (first != null)? first.data : 0;
			int y = (second != null)? second.data : 0;
			carry = (carry + x + y) / 10;
			p.next = new Node((x + y + carry) % 10);
			if(first!=null) first = first.next;
			if(second != null) second = second.next;
			p = p.next;
		}
		if(carry != 0)
			p.next = new Node(carry);
		return dummy.next;
	}
}
