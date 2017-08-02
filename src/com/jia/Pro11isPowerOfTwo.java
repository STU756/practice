package com.jia;

/**
 * Time:O(1)
 * Space:O(1)
 * @author Administrator
 *
 */
public class Pro11isPowerOfTwo {
	public static boolean isPowerOfTwo(int x) {
		return (x & (x - 1)) == 0;
	}
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(256));
	}
}
