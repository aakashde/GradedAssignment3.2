package com.problem2.service;
import com.problem2.model.Node;

public class FlattenBTToSkewedLogicImplementation {
	
	 static Node prevNode = null;
	 static Node headNode = null;
	 
	 // Function to to flatten the binary search tree into a skewed tree in increasing order
	 public static Node flattenBTToSkewed(Node root)
	 {
	     // Base Case
	     if(root == null)
	     {
	         return headNode;
	     }	    
	     flattenBTToSkewed(root.leftNode);
	     Node rightNodeNode = root.rightNode;
	     // Condition to check if the root Node
	     // of the skewed tree is not defined
	     if(headNode == null)
	     {
	         headNode = root;
	         root.leftNode = null;
	         prevNode = root;
	     }
	     else
	     {
	         prevNode.rightNode = root;
	         root.leftNode = null;
	         prevNode = root;
	     }	    
	     // Similarly recurse for the leftNode / rightNode
	     return flattenBTToSkewed(rightNodeNode);
	 }
}
