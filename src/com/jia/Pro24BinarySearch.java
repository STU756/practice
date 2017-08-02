package com.jia;

public class Pro24BinarySearch {
	/*
	 * Time:O(nlogn)
	 * Space:O(1)
	 */
	public static int findValue(int[] input, int target) {
		return findValue(input, target, 0, input.length - 1);
	}
	public static int findValue(int[] input, int target, int left, int right) {
		int mid = (left + right) >> 1;
		if(input[mid] == target)
			return mid;
		if(mid >= right) 
			return -1;
		if(input[mid] > target)
			return findValue(input, target, left, mid - 1);
		return findValue(input, target, mid + 1, right);
	}
}
