package com.jia;

/*
 * Time:O(n)
 * Space:O(1)
 */
public class Pro08String2Integer {
	private static int  maxdiv10 = Integer.MAX_VALUE / 10;
	public static int string2Integer(String str) {
		int result = 0;
		int carry = 1;
		str = str.trim();
		int i = 0;
		if(i < str.length() && str.charAt(i) == '-') {
			carry = -1;
			i++;
		}
		else if(i < str.length() && str.charAt(i) == '+') {
			i++;
		}
		while(i<str.length() && Character.isDigit(str.charAt(i))) {
			int temp = Character.getNumericValue(str.charAt(i));
			if(result > maxdiv10 || (result == maxdiv10) && temp>=8) {
				return (carry==-1)? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			result = result * 10 + temp;
			i++;
		}
		return carry * result;
	}
	public static void main(String[] args) {
		System.out.println(string2Integer(String.valueOf(Integer.MAX_VALUE)));
		System.out.println(string2Integer(String.valueOf(Integer.MIN_VALUE)));
		System.out.println(string2Integer("-253455555555555555556"));
		System.out.println(string2Integer("-25345"));
		System.out.println(string2Integer("+25345"));
	}
}
