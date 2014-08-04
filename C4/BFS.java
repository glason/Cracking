import java.util.LinkedList;

public class BFS{
	private static int[] visited;
	private static void bfs(Vertex[] graph,int v){
		System.out.println(graph[v].value);
		visited[v]=1;
		LinkedList<Vertex> queue = new LinkedList<Vertex>();
		queue.add(graph[v]);
		while(queue.size()!=0){
			Vertex vet = queue.removeFirst();
			Edge e = vet.link;
			while(e!=null){
				if(visited[e.adjvet]==0){
					System.out.println(graph[e.adjvet].value);
					queue.add(graph[e.adjvet]);
					visited[e.adjvet]=1;
				}
				e=e.next;
			}
		}
	}
	private static void traverse(Vertex[] graph){
		visited = new int[graph.length];
		for(int i=0;i<graph.length;i++)
			visited[i]=0;
		for(int i=0;i<graph.length;i++)
			if(visited[i]==0)
				bfs(graph,i);
	}
	public static void main(String[] args){
		Vertex[] vertexes = new Vertex[5];
		for(int i=0;i<5;i++){
			vertexes[i] =new Vertex();
			vertexes[i].value=i+1;
		}
		Edge[] edges = new Edge[4];
		for(int i=0;i<4;i++){
			edges[i]= new Edge();
		}
		edges[0].adjvet=1;
		edges[0].next=edges[1];
		vertexes[0].link=edges[0];
		//
		edges[1].adjvet=2;
		edges[1].next=null;
		//
		edges[2].adjvet=3;
		edges[2].next=null;
		vertexes[1].link=edges[2];
		//
		edges[3].adjvet=4;
		edges[3].next=null;
		vertexes[2].link=edges[3];
		//
		vertexes[3].link=null;
		vertexes[4].link=null;
		
		traverse(vertexes);
	}
}
