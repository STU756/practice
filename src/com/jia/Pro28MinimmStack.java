package com.jia;

import java.util.Stack;

public class Pro28MinimmStack<E extends Comparable<E>>  extends Stack<E> {
	private Stack<E> minStack;
	public Pro28MinimmStack() {
		super();
		minStack = new Stack<>();
	}
	
	@Override
	public E push(E item) {
		if(item.compareTo(minStack.peek()) <= 0)
			minStack.push(item);
		return super.push(item);
	}
	
	@Override
	public synchronized E pop() {
		E element = super.pop();
		if(element.compareTo(minStack.peek()) == 0)
			minStack.pop();
		return element;
	}
	
	public E findMin() {
		return minStack.peek();
	}
}
