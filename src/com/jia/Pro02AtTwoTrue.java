package com.jia;

public class Pro02AtTwoTrue {
	/**
	 * Time:O(1)
	 * Space:O(1)
	 */
	public static boolean atTwoTrue(boolean a, boolean b, boolean c) {
		return a? (b || c) : (b && c);
	}
	
	public static void main(String[] args) {
		System.out.println(atTwoTrue(true, false, true));
		System.out.println(atTwoTrue(true, false, false));
		System.out.println(atTwoTrue(true, true, true));
	}
}
