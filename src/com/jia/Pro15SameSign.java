package com.jia;

public class Pro15SameSign {
	
	/*
	 * Time:O(1)
	 * Space:O(1)
	 */
	public static boolean isSameSign(int x, int y) {
		return ((x ^ y) < 0);
	}
}
