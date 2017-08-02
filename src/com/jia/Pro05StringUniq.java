package com.jia;

import java.util.HashSet;

public class Pro05StringUniq {
	/**
	 * Time:O(n)
	 * Space:O(n)
	 * @param str
	 * @return
	 */
	public static boolean isUniq(String str) {
		if(str.isEmpty())
			return false;
		
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0; i<str.length(); i++) {
			if(set.contains(str.charAt(i))) return false;
			else
				set.add(str.charAt(i));
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isUniq("jia"));
		System.out.println(isUniq("jiajia"));
	}
}
