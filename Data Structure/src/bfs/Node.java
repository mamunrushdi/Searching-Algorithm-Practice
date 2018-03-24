package bfs;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Node 
{
	//A Unique Identifier for node
	public String stationName;
	
	//An array list containing a list of neighbor Nodes
	Node leftChild;
	Node rightChild;
	
	//create a Node object with constructor
	public Node(String stationName, Node firstChild, Node secondChild)
	{
		this.stationName = stationName;
		this.leftChild = firstChild;
		this.rightChild = secondChild;
	}//end of constructor
	
	
	//method to create Node of neighbors
	public ArrayList<Node> getChildren()
	{
		ArrayList<Node> childNodes = new ArrayList<>();
		
		if(this.leftChild != null)
		{
			childNodes.add(leftChild);
		}
		
		if(this.rightChild != null)
		{
			childNodes.add(rightChild);
		}
		
		return childNodes;
	}//end of method
	
	//helper method to remove child from our list
	public boolean removeChild(Node n)
	{
		return false;
	}//end of removeChild method
}//end of class Node
