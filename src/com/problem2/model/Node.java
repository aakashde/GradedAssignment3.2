package com.problem2.model;

public class Node {
	//implementing node model
	public Node leftNode;
	public Node rightNode;
	public int nodeData;
	
	public Node(int nodeData) {
		this.leftNode = null;
		this.rightNode = null;
		this.nodeData = nodeData;
		
	}
}