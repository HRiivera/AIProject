package Resources;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

import Resources.Graph.Edge;
import Resources.Graph.Node;
import Resources.RandomCollection;


public class RandomWalk {
	
	
	/*
	 * Recursively accepts a node and a map of a graph and returns an ArrayList of
	 * the names of the Nodes in the path. It uses the distance between 
	 * Nodes as a weight for the randomization.
	 * Backtracking is allowed.
	 */
	public ArrayList<String> RandomWalk(Node current, Map<Node, LinkedList<Edge>> map, ArrayList<String> Explored) {
		
		// List used to hold weights and results for randomization
		RandomCollection<Node> randomList = new RandomCollection<>();
		// List to hold the Edges connected to the selected node
		LinkedList<Edge> Frontier = map.get(current);
		// Refers to the node to be visited next
		Node nextNode;
	
		Explored.add(current.name);
		
		// Checks if the current Node is the goal or not
		// Returns Explored if it is
		if(current.isGoal = true) {
			return Explored;
		}
		else {
			// Iterates through the map's edges to set the weights for randomList
			// Weight depends on the distance to the next node
			// That weight is used to determine the probability of being chosen
			for(int i = 0; i < Frontier.size(); i++) {
				randomList.add(Frontier.get(i).distance, Frontier.get(i).destination);
			}	
			// Rolls for the node to be visited next
			nextNode = randomList.next();
			
		}
		return RandomWalk(nextNode, map, Explored);
	}
}
