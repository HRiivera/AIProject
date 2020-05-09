package Resources;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {


	private static class Edge{

		String destination;
		int speedLimit;
		int traffic;

		public Edge(String destination, int speedLimit, int traffic) {
			this.destination = destination;
			this.speedLimit = speedLimit;
			this.traffic = traffic;
		}
	}	
	
	
	private Map<String, LinkedList<Edge>> map = new HashMap<String, LinkedList<Edge>>();

	
	
	public void addVertex(String s) {
		map.put(s, new LinkedList<Edge>());
	}
	
	public void addEdge(String destination1, String destination2, int speedLimit, int traffic) {
		if(!map.containsKey(destination1) || !map.containsKey(destination2)) {
			throw new java.lang.Error("A destination has not been added");
		}
		else {
			map.get(destination1).add(new Edge(destination2, speedLimit, traffic));
			map.get(destination2).add(new Edge(destination1, speedLimit, traffic));
		}
	}
	
	public boolean hasVertex(String s) {
		return map.containsKey(s);
	}

	public boolean hasEdge(String s1, String s2) {
		for(Edge edge : map.get(s1)) {
			if(edge.destination.equals(s2))
				return true;
		}
		return false;
	}







}
