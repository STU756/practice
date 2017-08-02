package com.jia;

public class Pro22FindLowestCommonAncestor {
	public Tree findLowestCommonAncestor(Tree node, int value1, int value2) {
		if(node == null)
			return null;
		if(node.value > value1 && node.value > value2) {
			return findLowestCommonAncestor(node.left, value1, value2);
		}else if(node.value < value2 && node.value < value1) {
			return findLowestCommonAncestor(node.right, value1, value2);
		}else {
			return node;
		}
	}
}
