package GraphDS;

import java.util.LinkedList;

public class GraphG4G {

	public static class Graph {
		int v;
		LinkedList<Integer> adjListArray[];
		
		Graph(int v) {
			this.v=v;
			adjListArray=new LinkedList[v];
			for(int i=0;i<v;i++) {
				adjListArray[i]=new LinkedList<>();
			}
		}
	}
	
	public static void addEdge(Graph graf,int src, int destination) {
		graf.adjListArray[destination].addFirst(src);
		graf.adjListArray[src].addFirst(destination);
	}
	
	public static void printGraph(Graph graf) {
		for(int v=0;v<graf.v;v++) {
			System.out.println("Adj List of vertex "+v);
			System.out.print("head");
			for(Integer edge:graf.adjListArray[v]) {
				System.out.print("-> "+edge);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int v = 5;
        Graph graph = new Graph(v);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        
        printGraph(graph);
	}
}