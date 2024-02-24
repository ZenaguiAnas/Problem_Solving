package FAANGProblems.FacebookInterviewFindIfTwoBSTEqual;

import java.util.LinkedList;

import com.FindPathBetweenTwoNodes.BST;
import com.FindPathBetweenTwoNodes.TreeNode;

public class FindIf2BSTAreEqual {

	public static void main(String[] args) {
		
		BST bs1 = new BST();
		bs1.add(4, bs1.root);
		bs1.add(3, bs1.root);
		bs1.add(6, bs1.root);
		
		BST bs2 = new BST();
		bs2.add(6, bs2.root);
		bs2.add(3, bs2.root);
		bs2.add(4, bs2.root);
		
		LinkedList<Integer> ListofNodes1 = new LinkedList<Integer>();
		explore(bs1.root, ListofNodes1);
		System.out.println(ListofNodes1);
		
		LinkedList<Integer> ListofNodes2 = new LinkedList<Integer>();
		explore(bs2.root, ListofNodes2);
		System.out.println(ListofNodes2);

		
		if(ListofNodes1.equals(ListofNodes2)) {
			System.out.println("The trees are equal");
		} else {
			System.out.println("The trees are not equal");
			}

	}
	
	public static void explore(TreeNode currentnode, LinkedList<Integer> ListofNodes) {
		if(currentnode == null)
			return;
		
		explore(currentnode.left, ListofNodes);
		ListofNodes.add(currentnode.data);
		explore(currentnode.right, ListofNodes);
		
	}

}
