package FAANGProblems.BinarySearchTree;
public class BST {
	NodeTree root;
	
	public BST(NodeTree root) {
		this.root= root;
	}
	
	public void add(NodeTree newnode, NodeTree noderoot) {
		if(noderoot == null)
			return;
		
		if(newnode.value>noderoot.value) {
			noderoot.right = newnode;
		}
	}

}
