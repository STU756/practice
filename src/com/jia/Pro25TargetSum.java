package com.jia;

import java.util.HashMap;

public class Pro25TargetSum {
	/*
	 * Time:O(n)
	 * Space:O(n)
	 */
	public static int[] targetSum(int[] input, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0; i<input.length; i++) {
			int temp = target - input[i];
			if(map.containsKey(temp)) {
				return new int[] {map.get(temp), i};
			}else {
				map.put(input[i], i);
			}
		}
		return null;
	}
}
