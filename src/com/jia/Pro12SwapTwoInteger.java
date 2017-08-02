package com.jia;

public class Pro12SwapTwoInteger {
	/*
	 * Time:O(1)
	 * Space:O(1)
	 */
	public static void swapInPlace(int one, int two) {
		System.out.println("one=" + one + ";two=" + two);
		 one ^= two;
		 two ^= one;
		 one ^= two;
		 System.out.println("one=" + one + ";two=" + two);
	}
	public static void main(String[] args) {
		swapInPlace(1, 2);
	}
	
}
