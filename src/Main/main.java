package Main;

import Resources.Graph;
import Resources.Graph.Node;

public class main {
	
	public static void main(String[] args) {
		Graph mapPR = new Graph();
		makeGraph(mapPR);
		
	}
	
	private static void makeGraph(Graph g) {
		
		Node Aguadilla = new Node("Aguadilla", 16, false);
		Node Isabela = new Node("Isabela", 22, false);
		Node Quebradillas = new Node("Quebradillas", 23, false);
		Node Camuy = new Node("Camuy", 28, false);
		Node Hatillo = new Node("Hatillo", 29, false);
		Node Arecibo = new Node("Arecibo", 33, false);
		Node Rincon = new Node("Rincon", 12, false);
		Node Aguada = new Node("Aguada", 13, false);
		Node Moca = new Node("Moca", 14, false);
		Node SanSebastian = new Node("San Sebastian", 13, false);
		Node Lares = new Node("Lares", 19, false);
		Node Utuado = new Node("Utuado", 30, false);
		Node Anasco = new Node("Anasco", 9, false);
		Node Mayaguez = new Node("Mayaguez", 0, true);
		Node LasMarias = new Node("LasMarias", 11, false);
		Node Maricao = new Node("Maricao", 11, false);
		Node Adjuntas = new Node("Adjuntas", 28, false);
		Node Jayuya = new Node("Jayuya", 36, false);
		Node CaboRojo = new Node("CaboRojo", 8, false);
		Node Hormigueros = new Node("Hormigueros", 4, false);
		Node SanGerman = new Node("San German", 11, false);
		Node SabanaGrande = new Node("Sabana Grande", 15, false);
		Node Lajas = new Node("Lajas", 12, false);
		Node Guanica = new Node("Guanica", 22, false);
		Node Yauco = new Node("Yauco", 23, false);
		Node Guayanilla = new Node("Guayanilla", 26, false);
		Node Penuelas = new Node("Penuelas", 30, false);
		Node Ponce = new Node("Ponce", 37, false);
		
		g.addEdge(Aguadilla, Aguada, 7, 45, 0.8f);
		g.addEdge(Aguadilla, Isabela, 12, 45, 0.9f);
		g.addEdge(Aguadilla, Moca, 5, 30, 0.9f);
		g.addEdge(Isabela, Moca, 13, 35, 0.9f);
		g.addEdge(Isabela, Quebradillas, 8, 45, 0.9f);
		g.addEdge(Isabela, SanSebastian, 16, 35, 1f);
		g.addEdge(Quebradillas, Camuy, 7, 45, 0.9f);
		g.addEdge(Camuy, Lares, 17, 35, 0.8f);
		g.addEdge(Camuy, Hatillo, 2, 45, 0.8f);
//		g.addEdge(Hatillo, Arecibo, distance, speedLimit, traffic);
		
	}
	

}
