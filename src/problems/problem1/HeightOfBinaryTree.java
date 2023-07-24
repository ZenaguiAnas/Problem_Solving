package com.problem1;


import com.FindPathBetweenTwoNodes.TreeNode;

public class HeightOfBinaryTree {

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
		
		System.out.print(new HeightOfBinaryTree().Height(node1));

	}
	
	int max(int x, int y) {
		if(x<y)
			return y;
		
		return x;

	}
	
	public int Height(TreeNode root) {
		if(root == null)
			return -1;
		return 1+ max(Height(root.left),Height(root.right));
		
	}

}
