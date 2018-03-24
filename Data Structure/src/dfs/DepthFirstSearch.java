package dfs;

import java.util.ArrayList;
import java.util.Stack;

import bfs.Node;

/**
 * depth first search implementation using a stack structure instead of a queue
 * structure as exhibited in the breadth first search algorithm
 */

public class DepthFirstSearch extends AbstractSearch
{
	Node startNode;
	Node goalNode;
	
	public DepthFirstSearch(Node start, Node goal)
	{
		super(start, goal);
		this.startNode = start;
		this.goalNode = goal;
	}//end of constructor
	
	public boolean execute()
	{
		if(this.startNode.equals(goalNode))
		{
			System.out.println("Goal node found at 0 depth.");
			System.out.println(startNode);
			return true;
		}//end of if statement
		
		Stack<Node> nodeStack = new Stack<>();
		ArrayList<Node> visitedNodes = new ArrayList<>();
		
		nodeStack.add(startNode);
		
		while(!nodeStack.isEmpty())
		{
			Node current = nodeStack.pop();
			
			if(current.equals(goalNode))
			{
				System.out.println(visitedNodes);
				System.out.println("Goal Node found.");
				return true;
			}
			else
			{
				visitedNodes.add(current);
				nodeStack.addAll(current.getChildren());
			}
		}//end of while loop
		
		return false;
	}//end of execute method
}//end of DepthFirstSearch class
