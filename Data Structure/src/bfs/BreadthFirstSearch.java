package bfs;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;

/**
 * basic bread first search in Java
 * @author mamun
 *
 */
public class BreadthFirstSearch 
{
	Node startNode;
	Node goalNode;
	
	//object initialization by constructor
	public BreadthFirstSearch(Node start, Node goal)
	{
		this.startNode = start;
		this.goalNode = goal;
	}//end of constructor
	
	public boolean compute()
	{
		if(this.startNode.equals(goalNode))
		{
			System.out.println("Goal node found");
			System.out.println(startNode);
			return true;
		}//end of if statement
		
		//create a queue to hold the list of next to visit node
		Queue <Node> queue = new LinkedList<>();
		ArrayList<Node> explored = new ArrayList<>();
		queue.add(this.startNode);
		explored.add(startNode);
		
		while(!queue.isEmpty())
		{
			Node current = queue.remove();
			
			if(current.equals(goalNode))
			{
				//System.out.println(explored);
				return true;
			}
			else
			{
				if(current.getChildren().isEmpty())
				{
					return false;
				}
				
				else
				{
					queue.add(current);
				}
			}//end of else statement
		}//end of while loop
		
		return false;
	}//end of compute method
}//end of BreadFirstSearch class
