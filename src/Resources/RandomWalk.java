package Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


import Resources.Graph.Edge;
import Resources.Graph.Node;
import Resources.RandomCollection;


public class RandomWalk {
	
	
	/*
	 * Recursively accepts a node and a map of a graph and returns a Map of
	 * the names of the Nodes in the path and their distances. It uses the distance between 
	 * Nodes as a weight for the randomization.
	 * Backtracking is allowed.
	 */
	public Map<String, Integer> RandomWalk(Node current, Map<Node, LinkedList<Edge>> map, Map<String, Integer> Explored) {
		
		// List used to hold weights and results for randomization
		RandomCollection<Node> randomList = new RandomCollection<>();
		// List to hold the Edges connected to the selected node
		LinkedList<Edge> Frontier = map.get(current);
		// Refers to the node to be visited next
		Node nextNode;
		// Map that holds the path names and their values in terms of distance
		Map<String, Integer> Result = new HashMap<String, Integer>();
		
		// Checks if the current Node is the goal or not
		// Returns Result if it is
		if(current.isGoal = true) {
			// If the starting node is the goal, set the name and the distance traversed to 0
			if(Result.isEmpty()) {
				Result.put(current.name, 0);
			}
			// Returns path traversed and distances of each chosen node
			return Result;
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
			
			// Once a node has been chosen by the randomization, finds which path was chosen
			// and gets the distance traveled and then adds it to Result
			for(int k = 0; k < Frontier.size(); k++) {
				if(Frontier.get(k).destination == nextNode) {
					Result.put(current.name, Frontier.get(k).distance);
				}
			}
		}
		return RandomWalk(nextNode, map, Result);
	}
}
