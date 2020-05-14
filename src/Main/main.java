package Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import Resources.Graph;
import Resources.Pair;
import Resources.Graph.Edge;
import Resources.Graph.Node;
import Resources.RandomWalk;


public class main {

	public static void main(String[] args) {
		Graph g = new Graph();
		
		Node Aguadilla = new Node("Aguadilla", 15.66f, false);
		Node Isabela = new Node("Isabela", 22.14f, false);
		Node Quebradillas = new Node("Quebradillas", 23.22f, false);
		Node Camuy = new Node("Camuy", 27.74f, false);
		Node Hatillo = new Node("Hatillo", 28.77f, false);
		Node Arecibo = new Node("Arecibo", 33.85f, false);
		Node Rincon = new Node("Rincon", 11.85f, false);
		Node Aguada = new Node("Aguada", 12.67f, false);
		Node Moca = new Node("Moca", 13.55f, false);
		Node SanSebastian = new Node("San Sebastian", 13.55f, false);
		Node Lares = new Node("Lares", 18.73f, false);
		Node Utuado = new Node("Utuado", 29.5f, false);
		Node Anasco = new Node("Anasco", 5.86f, false);
		Node Mayaguez = new Node("Mayaguez", 0, true);
		Node LasMarias = new Node("LasMarias", 11.12f, false);
		Node Maricao = new Node("Maricao", 10.93f, false);
		Node Adjuntas = new Node("Adjuntas", 27.9f, false);
		Node Jayuya = new Node("Jayuya", 36.35f, false);
		Node CaboRojo = new Node("CaboRojo", 7.96f, false);
		Node Hormigueros = new Node("Hormigueros", 4.43f, false);
		Node SanGerman = new Node("San German", 10.81f, false);
		Node SabanaGrande = new Node("Sabana Grande", 14.86f, false);
		Node Lajas = new Node("Lajas", 11.92f, false);
		Node Guanica = new Node("Guanica", 22.19f, false);
		Node Yauco = new Node("Yauco", 22.58f, false);
		Node Guayanilla = new Node("Guayanilla", 26.42f, false);
		Node Penuelas = new Node("Penuelas", 29.60f, false);
		Node Ponce = new Node("Ponce", 37.28f, false);
		
		g.addVertex(Aguadilla);
		g.addVertex(Isabela);
		g.addVertex(Quebradillas);
		g.addVertex(Camuy);
		g.addVertex(Hatillo);
		g.addVertex(Arecibo);
		g.addVertex(Rincon);
		g.addVertex(Aguada);
		g.addVertex(Moca);
		g.addVertex(SanSebastian);
		g.addVertex(Lares);
		g.addVertex(Utuado);
		g.addVertex(Anasco);
		g.addVertex(Mayaguez);
		g.addVertex(LasMarias);
		g.addVertex(Maricao);
		g.addVertex(Adjuntas);
		g.addVertex(Jayuya);
		g.addVertex(CaboRojo);
		g.addVertex(Hormigueros);
		g.addVertex(SanGerman);
		g.addVertex(SabanaGrande);
		g.addVertex(Lajas);
		g.addVertex(Guanica);
		g.addVertex(Yauco);
		g.addVertex(Guayanilla);
		g.addVertex(Penuelas);
		g.addVertex(Ponce);
		
		g.addEdge(Aguadilla, Aguada, 4.01f, 45, 0.8f);
		g.addEdge(Aguadilla, Isabela, 9.88f, 45, 0.9f);
		g.addEdge(Aguadilla, Moca, 3.51f, 35, 0.9f);
		g.addEdge(Isabela, Moca, 9.38f, 35, 0.9f);
		g.addEdge(Isabela, Quebradillas, 5.94f, 45, 1f);
		g.addEdge(Isabela, SanSebastian, 11.79f, 35, 1f);
		g.addEdge(Quebradillas, Camuy, 5.92f, 45, 0.9f);
		g.addEdge(Camuy, Lares, 13.27f, 35, 1f);
		g.addEdge(Camuy, Hatillo, 1.31f, 45, 0.8f);
		g.addEdge(Hatillo, Arecibo, 7.28f, 45, 0.9f);
		g.addEdge(Rincon, Aguada, 4.9f, 35, 1f);
		g.addEdge(Aguada, Moca, 5.05f, 35, 1f);
		g.addEdge(Aguada, Anasco, 7.21f, 45, 0.8f);
		g.addEdge(Moca, Anasco, 7.76f, 35, 0.9f);
		g.addEdge(Moca, SanSebastian, 8.8f, 35, 0.9f);
		g.addEdge(SanSebastian, LasMarias, 5.44f, 35, 0.8f);
		g.addEdge(SanSebastian, Lares, 8.22f, 45, 0.8f);
		g.addEdge(Lares, LasMarias, 7.61f, 35, 0.8f);
		g.addEdge(Lares, Utuado, 11.75f, 35, 0.9f);
		g.addEdge(Lares, Adjuntas, 13.68f, 35, 0.8f);
		g.addEdge(Utuado, Adjuntas, 7.24f, 35, 1f);
		g.addEdge(Utuado, Jayuya, 7.86f, 35, 0.9f);
		g.addEdge(Anasco, Mayaguez, 5.81f, 45, 0.9f);
		g.addEdge(Anasco, LasMarias, 10.37f, 35, 0.8f);
		g.addEdge(Mayaguez, Hormigueros, 4.42f, 45, 0.8f);
		g.addEdge(Mayaguez, LasMarias, 16.7f, 35, 0.8f);
		g.addEdge(LasMarias, Maricao, 7.6f, 35, 0.9f);
		g.addEdge(Maricao, SanGerman, 7.99f, 35, 0.8f);
		g.addEdge(Maricao, SabanaGrande, 7.28f, 35, 0.8f);
		g.addEdge(Adjuntas, Penuelas, 7.33f, 35, 0.8f);
		g.addEdge(Jayuya, Ponce, 14.41f, 35, 1f);
		g.addEdge(Hormigueros, CaboRojo, 3.92f, 45, 0.9f);
		g.addEdge(Hormigueros, SanGerman, 6.97f, 45, 1f);
		g.addEdge(CaboRojo, SanGerman, 6.89f, 45, 1f);
		g.addEdge(CaboRojo, Lajas, 6.21f, 45, 0.9f);
		g.addEdge(SanGerman, Lajas, 2.44f, 35, 0.9f);
		g.addEdge(SanGerman, SabanaGrande, 5.30f, 45, 1f);
		g.addEdge(SabanaGrande, Guanica, 8.02f, 45, 0.9f);
		g.addEdge(SabanaGrande, Yauco, 7.81f, 45, 1f);
		g.addEdge(Lajas, Guanica, 11.27f, 35, 0.9f);
		g.addEdge(Guanica, Yauco, 5.81f, 45, 0.9f);
		g.addEdge(Yauco, Guayanilla, 4.02f, 45, 1f);
		g.addEdge(Guayanilla, Penuelas, 5.30f, 45, 1f);
		g.addEdge(Penuelas, Ponce, 8.21f, 45, 1f);
		
		ArrayList<Pair<String, Float>> Explored = new ArrayList<Pair<String, Float>>();
		RandomWalk random = new RandomWalk();
		float sum = 0;

		// Sets start time for the algorithm's runtime
		long startTime = System.nanoTime();
		
		Explored = random.RandomWalk(Camuy, g.getMap(), Explored);
		
		// How long the algorithm took to run
		long duration = System.nanoTime() - startTime;
		
		
		for(int i = 0; i < Explored.size(); i++) {
			System.out.println(Explored.get(i).toString());
			sum += Explored.get(i).getSecond();
		}
		
		System.out.println("\nTotal cost to goal: " + sum);
		System.out.println("RandomWalk Total Runtime: " + duration + " nanoseconds");
		
	}
	
	
	
	private static void makeGraph(Graph g) {
		
		Node Aguadilla = new Node("Aguadilla", 15.66f, false);
		Node Isabela = new Node("Isabela", 22.14f, false);
		Node Quebradillas = new Node("Quebradillas", 23.22f, false);
		Node Camuy = new Node("Camuy", 27.74f, false);
		Node Hatillo = new Node("Hatillo", 28.77f, false);
		Node Arecibo = new Node("Arecibo", 33.85f, false);
		Node Rincon = new Node("Rincon", 11.85f, false);
		Node Aguada = new Node("Aguada", 12.67f, false);
		Node Moca = new Node("Moca", 13.55f, false);
		Node SanSebastian = new Node("San Sebastian", 13.55f, false);
		Node Lares = new Node("Lares", 18.73f, false);
		Node Utuado = new Node("Utuado", 29.5f, false);
		Node Anasco = new Node("Anasco", 5.86f, false);
		Node Mayaguez = new Node("Mayaguez", 0, true);
		Node LasMarias = new Node("LasMarias", 11.12f, false);
		Node Maricao = new Node("Maricao", 10.93f, false);
		Node Adjuntas = new Node("Adjuntas", 27.9f, false);
		Node Jayuya = new Node("Jayuya", 36.35f, false);
		Node CaboRojo = new Node("CaboRojo", 7.96f, false);
		Node Hormigueros = new Node("Hormigueros", 4.43f, false);
		Node SanGerman = new Node("San German", 10.81f, false);
		Node SabanaGrande = new Node("Sabana Grande", 14.86f, false);
		Node Lajas = new Node("Lajas", 11.92f, false);
		Node Guanica = new Node("Guanica", 22.19f, false);
		Node Yauco = new Node("Yauco", 22.58f, false);
		Node Guayanilla = new Node("Guayanilla", 26.42f, false);
		Node Penuelas = new Node("Penuelas", 29.60f, false);
		Node Ponce = new Node("Ponce", 37.28f, false);
		
		g.addVertex(Aguadilla);
		g.addVertex(Isabela);
		g.addVertex(Quebradillas);
		g.addVertex(Camuy);
		g.addVertex(Hatillo);
		g.addVertex(Arecibo);
		g.addVertex(Rincon);
		g.addVertex(Aguada);
		g.addVertex(Moca);
		g.addVertex(SanSebastian);
		g.addVertex(Lares);
		g.addVertex(Utuado);
		g.addVertex(Anasco);
		g.addVertex(Mayaguez);
		g.addVertex(LasMarias);
		g.addVertex(Maricao);
		g.addVertex(Adjuntas);
		g.addVertex(Jayuya);
		g.addVertex(CaboRojo);
		g.addVertex(Hormigueros);
		g.addVertex(SanGerman);
		g.addVertex(SabanaGrande);
		g.addVertex(Lajas);
		g.addVertex(Guanica);
		g.addVertex(Yauco);
		g.addVertex(Guayanilla);
		g.addVertex(Penuelas);
		g.addVertex(Ponce);
		
		g.addEdge(Aguadilla, Aguada, 4.01f, 45, 0.8f);
		g.addEdge(Aguadilla, Isabela, 9.88f, 45, 0.9f);
		g.addEdge(Aguadilla, Moca, 3.51f, 35, 0.9f);
		g.addEdge(Isabela, Moca, 9.38f, 35, 0.9f);
		g.addEdge(Isabela, Quebradillas, 5.94f, 45, 1f);
		g.addEdge(Isabela, SanSebastian, 11.79f, 35, 1f);
		g.addEdge(Quebradillas, Camuy, 5.92f, 45, 0.9f);
		g.addEdge(Camuy, Lares, 13.27f, 35, 1f);
		g.addEdge(Camuy, Hatillo, 1.31f, 45, 0.8f);
		g.addEdge(Hatillo, Arecibo, 7.28f, 45, 0.9f);
		g.addEdge(Rincon, Aguada, 4.9f, 35, 1f);
		g.addEdge(Aguada, Moca, 5.05f, 35, 1f);
		g.addEdge(Aguada, Anasco, 7.21f, 45, 0.8f);
		g.addEdge(Moca, Anasco, 7.76f, 35, 0.9f);
		g.addEdge(Moca, SanSebastian, 8.8f, 35, 0.9f);
		g.addEdge(SanSebastian, LasMarias, 5.44f, 35, 0.8f);
		g.addEdge(SanSebastian, Lares, 8.22f, 45, 0.8f);
		g.addEdge(Lares, LasMarias, 7.61f, 35, 0.8f);
		g.addEdge(Lares, Utuado, 11.75f, 35, 0.9f);
		g.addEdge(Lares, Adjuntas, 13.68f, 35, 0.8f);
		g.addEdge(Utuado, Adjuntas, 7.24f, 35, 1f);
		g.addEdge(Utuado, Jayuya, 7.86f, 35, 0.9f);
		g.addEdge(Anasco, Mayaguez, 5.81f, 45, 0.9f);
		g.addEdge(Anasco, LasMarias, 10.37f, 35, 0.8f);
		g.addEdge(Mayaguez, Hormigueros, 4.42f, 45, 0.8f);
		g.addEdge(Mayaguez, LasMarias, 16.7f, 35, 0.8f);
		g.addEdge(LasMarias, Maricao, 7.6f, 35, 0.9f);
		g.addEdge(LasMarias, Lares, 7.65f, 35, 0.8f);
		g.addEdge(Maricao, SanGerman, 7.99f, 35, 0.8f);
		g.addEdge(Maricao, SabanaGrande, 7.28f, 35, 0.8f);
		g.addEdge(Adjuntas, Penuelas, 7.33f, 35, 0.8f);
		g.addEdge(Jayuya, Ponce, 14.41f, 35, 1f);
		g.addEdge(Hormigueros, CaboRojo, 3.92f, 45, 0.9f);
		g.addEdge(Hormigueros, SanGerman, 6.97f, 45, 1f);
		g.addEdge(CaboRojo, SanGerman, 6.89f, 45, 1f);
		g.addEdge(CaboRojo, Lajas, 6.21f, 45, 0.9f);
		g.addEdge(SanGerman, Lajas, 2.44f, 35, 0.9f);
		g.addEdge(SanGerman, SabanaGrande, 5.30f, 45, 1f);
		g.addEdge(SabanaGrande, Guanica, 8.02f, 45, 0.9f);
		g.addEdge(SabanaGrande, Yauco, 7.81f, 45, 1f);
		g.addEdge(Lajas, Guanica, 11.27f, 35, 0.9f);
		g.addEdge(Guanica, Yauco, 5.81f, 45, 0.9f);
		g.addEdge(Yauco, Guayanilla, 4.02f, 45, 1f);
		g.addEdge(Guayanilla, Penuelas, 5.30f, 45, 1f);
		g.addEdge(Penuelas, Ponce, 8.21f, 45, 1f);

		
		
	}

}
