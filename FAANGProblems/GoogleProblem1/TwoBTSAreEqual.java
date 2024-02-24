package FAANGProblems.GoogleProblem1;

import java.util.HashSet;

import com.FindPathBetweenTwoNodes.BST;
import com.FindPathBetweenTwoNodes.TreeNode;

public class TwoBTSAreEqual {

	public static void main(String[] args) {
		
		new TwoBTSAreEqual().run();
		
	}
	
	public void run() {
		BST bst1 = new BST();
		bst1.add(10, bst1.root);
		bst1.add(11, bst1.root);
		bst1.add(9, bst1.root);
		scanTree(bst1.root, true);
		
		
		BST bst2 = new BST();
		bst2.add(11, bst2.root);
		bst2.add(9, bst2.root);
		bst2.add(10, bst2.root);
		scanTree(bst2.root, false);

		if(isEqual == true) {
		System.out.println("The trees are equal !");
		} else {
		System.out.println("The trees are not equal !");
		}
		
	}
	
	HashSet<Integer> set = new HashSet<>();
	boolean isEqual =true;
	
	public void scanTree(TreeNode node, boolean isSaved) {
		if(node == null)
			return;
		
		if(isSaved == true) {
			set.add(node.data);
		}
		else {
			if(!set.contains(node.data)) {
				isEqual = false;
				//System.out.println("The trees are not equal !");
			}
		}
		scanTree(node.left, isSaved);
		scanTree(node.right, isSaved);
	}

}
