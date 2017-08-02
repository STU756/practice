package com.jia;

import java.util.ArrayList;
import java.util.List;

public class Pro23FindShortestPath {
	/*
	 * Time:O(n)
	 * Space:O(n)
	 */
	public static List<Tree> findShortestPath(Tree root, int value1, int value2){
		List<Tree> result = new ArrayList<Tree>();
		root = findLowestCommonAncestor(root, value1, value2); //最近祖先
		//左右路径
		List<Tree> left = findPath(root, value1);   
		List<Tree> right = findPath(root, value2);
		
		if(value1 < value2) {
			left.remove(left.size() - 1);
			result.addAll(left);
			result.addAll(right);
		}else {
			right.remove(right.size() - 1);
			result.addAll(right);
			result.addAll(left);
		}
		return result;
	}
	
	public static List<Tree> findPath(Tree node, int value){
		List<Tree> result = new ArrayList<Tree>();
		if(node.value == value) {
			result.add(node);
			return result;
		}
		if(node.value > value) {
			List<Tree> left = findPath(node.left, value);
			result.addAll(left);
			result.add(node);
		}
		if(node.value < value) {
			result.add(node);
			List<Tree> right = findPath(node.right, value);
			result.addAll(right);
		}
		return result;
	}
	public static Tree findLowestCommonAncestor(Tree node, int value1, int value2) {
		if(node == null)
			return null;
		if(node.value > value1 && node.value > value2)
			return findLowestCommonAncestor(node.left, value1, value2);
		else if(node.value < value1 && node.value < value2) 
			return findLowestCommonAncestor(node.right, value1, value2);
		else
			return node;
	}
}
