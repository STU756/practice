package com.jia;

public class Pro04isRotation {
	/**
	 * Time:O(n^2)
	 * Space:O(n)
	 * @param one
	 * @param two
	 * @return
	 */
	public static boolean isRotation(String one, String two) {
		return (one.length() == two.length())
				&& Pro03Reverse.reverse(one).equals(two);
	}
	public static void main(String[] args) {
		System.out.println(isRotation("jia", "aij"));
	}
}
