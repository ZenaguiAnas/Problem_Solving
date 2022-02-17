package com.problem2;

import java.util.HashMap;


import com.FindPathBetweenTwoNodes.TreeNode;

public class TopViewofTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}
	

	HashMap<Object,Integer> l = new HashMap<>();
	public void Top_View(TreeNode node, int level) {
		
	
		if(node == null)
		//	continue;
		
		if(!l.containsKey(node)) {
			l.put(node, level);
		}
		
	
			
		
	}

}
