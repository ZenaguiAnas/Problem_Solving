package FAANGProblems.GoogleProblem2;

import com.FindPathBetweenTwoNodes.TreeNode;

public class CheckIfTwoTreesAreMirror {

	public static void main(String[] args) {
		
		CheckIfTwoTreesAreMirror chk = new CheckIfTwoTreesAreMirror();
		chk.buildTree();
	}
	
	void buildTree() {
		// Tree1
		TreeNode node1 = new TreeNode(1, null, null);
		TreeNode node2 = new TreeNode(2, null, null);
		TreeNode node3 = new TreeNode(3, null, null);
		TreeNode node4 = new TreeNode(4, null, null);
		TreeNode node5 = new TreeNode(5, null, null);
		
		node1.left = node3;
		node1.right = node2;
		
		node2.left = node5;
		node2.right = node4;
		
		// Tree2
		node1.left = node2;
		node1.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		
		
		explore1(node1);
		
		System.out.println("\n");
		
		explore2(node1);	
		
	}
	
	
	// Preorder way (TLR)
	public void explore1(TreeNode node) {
		if(node != null) {
			System.out.print(node.data + "\t");
			explore1(node.left);
			explore1(node.right);
		}
	}
	
	
	// Postorder way (LRT)
	public void explore2(TreeNode node) {
		if(node != null) {
			System.out.print(node.data + "\t");
			explore2(node.right);
			explore2(node.left);
		}
	}

}
