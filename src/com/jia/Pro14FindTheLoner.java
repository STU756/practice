package com.jia;

public class Pro14FindTheLoner {
	/*
	 * Time:O(n)
	 * Space:O(1)
	 */
	public static int findTheLoner(int[] input) {
		int value = 0;
		for(int i=0; i<input.length; i++) {
			value = value ^ input[i];
		}
		return value;
	}
}
