package dfs;

import bfs.Node;

public class DFSTest 
{
	/**
	 * Our main BFSTest class which instantiates some example nodes
	 * and then performs the breadth first search upon these newly created
	 * nodes.
	 */

	public static void main(String[] args) 
	{ 
		Node station1 = new Node("Westminster", null, null);
		Node station2 = new Node("Waterloo", station1, null);
		Node station3 = new Node("Trafalgar Square", station1, station2);
		Node station4 = new Node("Canary Wharf", station2, station3);
		Node station5 = new Node("London Bridge", station3, station4);
		Node station6  = new Node("Tottenham Court Road", station4, station5);
		
 
		AbstractSearch dfs = new DepthFirstSearch(station6, station4);
		
 
		if(dfs.execute())
		{
 
			System.out.println("Path found");
		}
		else
			System.out.println("Path notfound.");
		 
	}//end of main class
}//end of main method
