package com.problem2.driver;

import com.problem2.model.Node;
import com.problem2.service.FlattenBTToSkewedLogicImplementation;
import com.problem2.service.NodeTraverseingLogic;

public class Main {
		 
	 static Node prevNode = null;
	 static Node headNode = null;
	 public static void main (String[] args)
	 {
	     //			50
		 //			/ \
		 //		   30  60
		 //		   /   /
		 //		  10  55	
	     Node root = new Node(50);
	     root.leftNode = new Node(30);
		 root.rightNode = new Node(60);
		 root.leftNode.leftNode = new Node(10);
		 root.rightNode.leftNode = new Node(55);
		 
		 headNode = FlattenBTToSkewedLogicImplementation.flattenBTToSkewed(root);
		 System.out.println("node values in ascending order");
		 NodeTraverseingLogic.traverserightNodeSkewed(headNode);
	 }
}
