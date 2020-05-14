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

	private class RouteNode{
		RouteNode previousNode;
		Node currentNode;
		float pathCost;

		public RouteNode(Node currentNode, RouteNode previousNode, float pathCost) {
			this.currentNode = currentNode;
			this.previousNode = previousNode;
			this.pathCost = pathCost;
		}
	}


	public RouteNode aStarSearch(Graph graph, Node start) {

		//Creating the Node list and the Path list 
		LinkedList<RouteNode> nodeList = new LinkedList<RouteNode>(); // Nodes list
		LinkedList<Node> visitedList = new LinkedList<Node>(); // Path list / Visited list


		nodeList.add(new RouteNode(start, null, 0));
		visitedList.add(start);

		while(nodeList.size()!=0) { // Loop to run through the nodes available

			float minF = nodeList.get(0).pathCost + nodeList.get(0).currentNode.heuristic/45;
			RouteNode lowestNode = nodeList.get(0);

			for(RouteNode n : nodeList) { // Loop to find the node with the lowest distance
				if(n.currentNode.isGoal) {
					return n; // Found and finish : fix to add the path and stuff
				}
				if(n.pathCost + n.currentNode.heuristic < minF) {
					minF = n.pathCost + n.currentNode.heuristic;
					lowestNode = n;
				}

			}


			LinkedList<Edge> edgeList = graph.getEdges(lowestNode.currentNode); //Create a linked list of the nodes
			//connected to the node I'm looking at

			for(Edge e : edgeList) { //Looks through the edges of the node to find the shortest
				if(!e.destination.equals(lowestNode.previousNode.currentNode)) {

					float pathCost = e.distance/(e.speedLimit*e.traffic) + lowestNode.pathCost;
					nodeList.add(new RouteNode(e.destination, lowestNode, pathCost)); //Add all destinations to the list to look at later

				}
			}
		}
		return null;
	}
}
