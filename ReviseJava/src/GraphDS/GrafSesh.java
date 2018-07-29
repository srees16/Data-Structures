package GraphDS;

public class GrafSesh {

	public static void main(String[] args) {
		
		
	}
	
	class vertex {
		String name;
		Neibor adjList;
		
		vertex(String name,Neibor nbors) {
			this.name=name;
			this.adjList=nbors;
		}
	}
	
	class Neibor {
		int vertxNum;
		Neibor next;
		Neibor(int vnum,Neibor nbr) {
			vertxNum=vnum;
			next=nbr;
		}
	}
	
	class graf {
		vertex adjList[];
		
		public void dfs(int v,boolean visited[]) {
			visited[v]=true;
		}
	}
}