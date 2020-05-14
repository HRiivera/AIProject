package Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import Resources.Graph.Edge;
import Resources.Graph.Node;

import java.util.List;
import java.util.PriorityQueue;

public class AStar {
	
	
	public LinkedList<Node> aStarSearch(Graph graph, Node start) {

        //Creating the Node list and the Path list 
        LinkedList<Node> nodeList = new LinkedList<Node>(); // Nodes list
        LinkedList<Node> visitedList = new LinkedList<Node>(); // Path list / Visited list
        
        
        start.heuristic=0;
        nodeList.add(start);
        visitedList.add(start);
        
        while(nodeList.size()!=0) { // Loop to run through the nodes available
        	
        	int smallestDistance = nodeList.get(0).heuristic;
        	int g=0;
        	
        	for(int i = 0; i < nodeList.size()-1; i++) { // Loop to find the node with the lowest distance
        		if(nodeList.get(i).isGoal) {
        			visitedList.add(visitedList.get(i));
        			return nodeList; // Found and finish : fix to add the path and stuff
        		}
        		if(nodeList.get(i).heuristic < smallestDistance) {
        			smallestDistance = nodeList.get(i).heuristic;
        			g = i; // Save the index to access later
        		}
        		
        	}
        	

        	LinkedList<Edge> edgeList = graph.getEdges(nodeList.remove(g)); //Create a linked list of the nodes
        																	//connected to the node I'm looking at
        	float shortestEdge = edgeList.get(0).getCost();
        	int d = 0;
        	
        	for(int i = 0; i < edgeList.size(); i++) { //Looks through the edges of the node to find the shortest
        		nodeList.add(edgeList.get(i).destination); //Add all destinations to the list to look at later
        		if(edgeList.get(i).getCost() < shortestEdge) {
        			shortestEdge = edgeList.get(i).distance;
        			d = i;
        		}
        	}
        	nodeList.add(edgeList.get(d).destination); //Adds the shortest node to the path list "nodeList"
   	
        }
        
        return nodeList;
	}
	

}
