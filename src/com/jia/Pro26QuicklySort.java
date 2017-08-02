package com.jia;

/*
 * Time:worst case(n^2), average case O(nlogn)
 * Space:O(1)
 */
public class Pro26QuicklySort {
	public static int[] quicklySort(int[] arr) {
		qSort(arr, 0, arr.length-1);
		return arr;
	}
	private static void qSort(int[] arr, int start, int end) {
		int povit = arr[start];
		int left = start, right = end;
		while(left < right) {
			while(left < right && arr[right] >= povit) right --;
			if(left < right) arr[left++] = arr[right];
			while(left < right && arr[left] <= povit) left ++;
			if(left < right) arr[right--] = arr[left];
		}
		arr[left] = povit;
		if(left - start > 1) qSort(arr, start, left - 1);
		if(end - right > 1) qSort(arr, right + 1, end);
	}
}
