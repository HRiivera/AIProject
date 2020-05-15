package Resources;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;


import Resources.Graph.Edge;
import Resources.Graph.Node;


public class RandomWalk {
	
	
	/*
	 * Recursively accepts a node and a map of a graph and returns a Map of
	 * the names of the Nodes in the path and their distances. It uses the distance between 
	 * Nodes as a weight for the randomization.
	 * Backtracking is allowed.
	 */
	public ArrayList<Triple<String, Float, Float>> RandomWalk(Node current, Map<Node, LinkedList<Edge>> map, ArrayList<Triple<String, Float, Float>> Result, float goalDist, float totalCost) {
		
		// List used to hold weights and results for randomization
		RandomCollection<Node> randomList = new RandomCollection<>();
		// List to hold the Edges connected to the selected node
		LinkedList<Edge> Frontier = map.get(current);
		// Refers to the node to be visited next
		Node nextNode;
		// Pair where the current node and the distance needed to reach it are saved
		Triple<String, Float, Float> triple = new Triple<String, Float, Float>(null, null, null);
		
		// Checks if the current Node is the goal or not
		// Returns Result if it is
		if(current.isGoal == true) {
			
			triple.setFirst(current.name);
			triple.setSecond(goalDist);
			triple.setThird(totalCost);
			
			Result.add(triple);
			
			
			return Result;
		}
		else {
			
			
			// Iterates through the map's edges to set the weights for randomList
			// Weight depends on the distance to the next node
			// That weight is used to determine the probability of being chosen
			for(int i = 0; i < Frontier.size(); i++) {
				randomList.add(Frontier.get(i).distance/(Frontier.get(i).speedLimit*Frontier.get(i).traffic), Frontier.get(i).destination);
			}	
			
			
			// Rolls for the node to be visited next
			nextNode = randomList.next();
			
			// Once a node has been chosen by the randomization, finds which path was chosen
			// and gets the distance traveled and then adds it to Result
			for(int k = 0; k < Frontier.size(); k++) {
				if(Frontier.get(k).destination == nextNode) {
						
					triple.setFirst(current.name);
					triple.setSecond(Frontier.get(k).distance);
						
					goalDist = triple.getSecond();
					totalCost = goalDist/(Frontier.get(k).speedLimit*Frontier.get(k).traffic);	
					
					triple.setThird(totalCost);
					
					Result.add(triple);
				}
			}
		}
		return RandomWalk(nextNode, map, Result, goalDist, totalCost);
	}
}
