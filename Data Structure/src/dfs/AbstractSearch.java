package dfs;
/**
 * AbstractSearch class provides a template for all future 
 * graph traversal algorithm must adhere.  
 * this will make "hot-swap" easier in different algorithm
 * 
 * @author mamun
 *
 */
import bfs.Node;

public abstract class AbstractSearch
{
	Node startNode;
	Node goalNode;
	
	//object creation and initialization
	public AbstractSearch(Node start, Node goal)
	{
		this.startNode = start;
		this.goalNode = goal;
	}//end of constructor

	public abstract boolean execute();
	
}//end of AbstractSearch class
