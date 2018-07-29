package GraphDS;

import java.util.*;

public class Graph {

	private final int MAX_VERTS=20;
	private vertex vertx[];
	private int adjMatrix[][];
	private int nVerts;
	
	public Graph() {
		vertx=new vertex[MAX_VERTS];
		adjMatrix=new int[MAX_VERTS][MAX_VERTS];
		nVerts=0;
		for(int j=0;j<MAX_VERTS;j++) {
			for(int k=0;k<MAX_VERTS;k++) {
				adjMatrix[j][k]=0;
			}
		}
	}
	
	public void addVertex(char label) {
		vertx[nVerts++]=new vertex(label);
	}
	
	public void addEdge(int start,int end) {
		adjMatrix[start][end]=1;
		adjMatrix[end][start]=1;
	}
	
	public void displayVertex(int v) {
		System.out.println(vertx[v].label);
	}
}

class vertex {
	public char label;
	public boolean wasVisited;
	
	public vertex(char label) {
		this.label=label;
		wasVisited=false;
	}
}