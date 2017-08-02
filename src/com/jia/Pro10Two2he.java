package com.jia;

public class Pro10Two2he {
	public static int twoToThe(int x) {
		return 1 << x;
	}
	
	public static void main(String[] args) {
		System.out.println(twoToThe(3));
		System.out.println(twoToThe(32));
	}
}
