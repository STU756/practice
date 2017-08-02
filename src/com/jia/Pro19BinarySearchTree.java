package com.jia;

public class Pro19BinarySearchTree {
	public static void insert(Tree head, Tree newNode) {
		if(newNode.value < head.value) {
			if(head.left == null) {
				head.left = newNode;
			}else {
				insert(head.left, newNode);
			}
		}else {
			if(head.right == null) {
				head.right = newNode;
			}else {
				insert(head.right, newNode);
			}
		}
	}
}
