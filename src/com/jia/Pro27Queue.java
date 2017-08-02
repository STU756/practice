package com.jia;

import java.util.Stack;

public class Pro27Queue<E> {
	private Stack<E> incoming = new Stack<>();
	private Stack<E> outcoming = new Stack<>();
	public void queue(E item) {
		incoming.push(item);
	}
	
	
	public E dequeue() {
		if(outcoming.isEmpty()) {
			while(!incoming.isEmpty()) {
				outcoming.push(incoming.pop());
			}
		}
		return outcoming.pop();
	}
}
