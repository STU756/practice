package com.jia;

public class Pro07ReverseWordOrder {
	/*
	 * Time:O(n)
	 * Space:O(1)
	 */
	public  static char[] reverseWordOrder(char[] str) {
		reverseCharacters(str, 0, str.length);
		int lastSpace = 0;
		for(int i = 0; i < str.length; i++) {
			if(str[i] == ' ') {
				reverseCharacters(str, lastSpace, i);
				lastSpace = i + 1;
			}
		}
		reverseCharacters(str, lastSpace, str.length);
		return str;
	}
	
	private static void reverseCharacters(char[] str, int min, int max) {
		for(int i = 0; i<(max-min) / 2; i++) {
			char temp = str[min + i];
			str[min + i] = str[max -i - 1];
			str[max -i - 1] = temp;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWordOrder("jiajia meimei jia ".toCharArray()));
	}
}
