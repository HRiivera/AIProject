package Resources;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {


	public static class Edge{

		Node destination;
		int distance;
		int speedLimit;
		int traffic;

		public Edge(Node destination, int distance, int speedLimit, int traffic) {
			this.distance = distance;
			this.destination = destination;
			this.speedLimit = speedLimit;
			this.traffic = traffic;
		}
	}
	
	public static class Node{
		String name;
		int heuristic;
		boolean isGoal;
		
		public Node(String name, int heuristic, boolean isGoal) {
			this.name = name;
			this.heuristic = heuristic;
			this.isGoal = isGoal;
		}
	}
	
	
	private Map<Node, LinkedList<Edge>> map = new HashMap<Node, LinkedList<Edge>>();

	
	
	public void addVertex(Node s) {
		map.put(s, new LinkedList<Edge>());
	}
	
	public void addEdge(Node destination1, Node destination2, int distance, int speedLimit, int traffic) {
		if(!map.containsKey(destination1) || !map.containsKey(destination2)) {
			throw new java.lang.Error("A destination has not been added");
		}
		else {
			map.get(destination1).add(new Edge(destination2, distance, speedLimit, traffic));
			map.get(destination2).add(new Edge(destination1, distance, speedLimit, traffic));
		}
	}
	
	public boolean hasVertex(Node s) {	
		return map.containsKey(s);
	}

	public boolean hasEdge(Node s1, Node s2) {
		for(Edge edge : map.get(s1)) {
			if(edge.destination.equals(s2))
				return true;
		}
		return false;
	}

	public LinkedList<Edge> getEdges(Node s){
		return map.get(s);
	}

	public Map<Node, LinkedList<Edge>> getMap() {
		return map;
	}

}
