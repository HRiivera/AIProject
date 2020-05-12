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

        //Creating the visited/unvisited nodes list
        LinkedList<Node> nodeList = new LinkedList<Node>(); //visited
        LinkedList<Node> visitedList = new LinkedList<Node>(); //unvisited
        
        
        start.heuristic=0;
        nodeList.add(start);
        
        while(nodeList.size()!=0) { // Loop to run through the nodes 
        	
        	int smallestDistance = nodeList.get(0).heuristic;
        	int g=0;
        	
        	for(int i = 0; i < nodeList.size()-1; i++) { // Loop to find the node with the lowest distance
        		if(nodeList.get(i).isGoal) {
        			nodeList.add(nodeList.get(i));
        			return nodeList;
        		}
        		if(nodeList.get(i).heuristic < smallestDistance) {
        			smallestDistance = nodeList.get(i).heuristic;
        			g = i; // Save the index to access later
        		}
        	}
        	

        	LinkedList<Edge> edgeList = graph.getEdges(nodeList.get(g)); //Create a linked list of the nodes
        																 //connected to the node I'm looking at
        	
//        	edgeList.get(1).
        	
        	
        	
        }

        return null;
	}
	
//	public void pair
}
