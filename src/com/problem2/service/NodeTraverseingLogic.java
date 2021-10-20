package com.problem2.service;
import com.problem2.model.Node;

public class NodeTraverseingLogic {

	// Function to traverse the skewed tree to print the same
	public static void traverserightNodeSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.nodeData + " ");
		if(root.rightNode!=null)
			System.out.print(" -> ");
		traverserightNodeSkewed(root.rightNode);       
	}
}
