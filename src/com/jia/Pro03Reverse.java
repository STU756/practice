package com.jia;

public class Pro03Reverse {
	/**
	 * Time:O(n)
	 * Space:O(n)
	 * @param str
	 * @return
	 */
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(reverse("jajai"));
	}
}
