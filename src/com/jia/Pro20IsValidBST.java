package com.jia;

import java.util.Currency;

public class Pro20IsValidBST {
	public static boolean isValidBST(Tree root) {
		return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	public static boolean isValidBST(Tree current, int min, int max) {
		if(current.left != null) {
			if(current.left.value > min ||
				!isValidBST(current.right, current.left.value, max))
				return false;
		}
		if(current.right != null) {
			if(current.right.value < max ||
				!isValidBST(current.right, min, current.right.value))
				return false;
		}
		return true;
	}
}
;