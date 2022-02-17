package com.problem3;

import java.util.ArrayList;

import com.FindPathBetweenTwoNodes.TreeNode;

public class SerializeAndDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode node1 = new TreeNode(1, null, null);
		TreeNode node2 = new TreeNode(2, null, null);
		TreeNode node3 = new TreeNode(3, null, null);
		TreeNode node4 = new TreeNode(4, null, null);
		TreeNode node5 = new TreeNode(5, null, null);
		
		node1.left = node3;
		node1.right = node2;
		
		node2.left = node5;
		node2.right = node4;
		
		SerializeAndDeserialize srl = new SerializeAndDeserialize();
		srl.serialize(node1);
		System.out.println(srl.arraylist);
		
	}
	
	ArrayList<Integer> arraylist = new ArrayList<>();
	void serialize(TreeNode node) {
		if(node != null) {
			arraylist.add(node.data);
			serialize(node.left);
			serialize(node.right);
		}
		else {
			arraylist.add(null);
		}
	}

}
