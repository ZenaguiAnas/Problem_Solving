package com.problem4;
import com.FindPathBetweenTwoNodes.BST;
import com.FindPathBetweenTwoNodes.TreeNode;

public class ThePredecessorOfBTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BST bst = new BST();
		bst.add(7, bst.root);
		bst.add(4, bst.root);
		bst.add(9, bst.root);
		bst.add(2, bst.root);
		bst.add(6, bst.root);
		bst.add(5, bst.root);
		bst.add(1, bst.root);
		bst.add(3, bst.root);
		
		TreeNode node =new ThePredecessorOfBTS().pred(bst.root, 1, 3);
		
		System.out.print(node.data);
	}
	
	
	public TreeNode pred(TreeNode root, int v1, int v2) {
		if(root == null)
			return null;
		
		if(root.data > v1 && root.data >v2)
			return pred(root.left,v1,v2);
		
		else if (root.data < v1 && root.data <v2)
			return pred(root.right,v1,v2);
		
		else {
			return root;
		}
	}

}
