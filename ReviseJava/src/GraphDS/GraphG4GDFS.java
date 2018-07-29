package GraphDS;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphG4GDFS {

	private int v;
	private LinkedList<Integer> adj[];
	
	GraphG4GDFS(int v) {
		this.v=v;
		adj=new LinkedList[v];
		for(int i=0;i<v;++i) {
			adj[i]=new LinkedList<>();
		}
	}
	
	void addEdge(int v,int w) {
		adj[v].add(w);
	}
	
	void DFS(int v) {
		boolean visited[]=new boolean[this.v];
		DFSUtil(v,visited);
	}
	
	void DFSUtil(int v,boolean visited[]) {
		visited[v]=true;
		System.out.print(v+" ");
		Iterator<Integer> i =adj[v].listIterator();
		while(i.hasNext()) {
			int n=i.next();
			if(!visited[n]) {
				DFSUtil(n,visited);
			}
		}
	}
	
	public static void main(String[] args) {
		GraphG4GDFS graf=new GraphG4GDFS(4);
		graf.addEdge(0, 1);
		graf.addEdge(0, 2);
		graf.addEdge(1, 2);
		graf.addEdge(2, 0);
		graf.addEdge(2, 3);
		graf.addEdge(3, 3);
		
		System.out.println("Depth First Traversal (starting from vertex 2)");
		graf.DFS(2);
	}
}