package com.jia;

public class Pro17hasCycle {
	public static boolean hasCycle(Node head) {
		if(head == null)
			return false;
		Node turtle = null, rabbit = null;
		while(true) {
			turtle = turtle.next;
			if(rabbit.next != null)
				rabbit = rabbit.next.next;
			else
				return false;
			
			if(turtle == null || rabbit == null)
				return false;
			if(turtle == rabbit)
				return false;
		}
	}
}
