package com.FindPathBetweenTwoNodes;

public class BST {
	
	public TreeNode root;
	
	public BST() {
		this.root=null;
	}
	
	
	
	public void add(int value, TreeNode StartNode) {
		if(root == null) {
			root = new TreeNode(value,null,null);
			return;
		}
		
		if(value > StartNode.data) {
			if(StartNode.right == null) {
				StartNode.right = new TreeNode(value, null, null);
				}
				
				else {
					add(value, StartNode.right);
				}
		}
		
		if(value < StartNode.data) {
			if(StartNode.left == null) {
				StartNode.left = new TreeNode(value, null, null);
				}
				
				else {
					add(value, StartNode.left);
				}
		}
		
	}



//	public void FindPath(int i, TreeNode root2) {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	
//		}
}

