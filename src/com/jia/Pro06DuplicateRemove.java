package com.jia;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pro06DuplicateRemove {
	
	/**
	 * Time:O(n)
	 * Space:O(n)
	 * @param str
	 * @return
	 */
	public static String removeDuplicates(String str) {
		char[] chars = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for(char c : chars) {
			charSet.add(c);
		}
		
		StringBuilder sb = new StringBuilder();
		for(Character character:charSet) {
			sb.append(character);
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates("ajijaiajai"));
	}
}
