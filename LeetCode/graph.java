import java.util.*;
class Graph{
    ArrayList<ArrayList<Integer>>adjList;
    int V;
    Graph(int V){
        this.V = V;
        adjList = new ArrayList<>();
        for(int i=0; i<V; i++){
            adjList.add(new ArrayList<>());
        }
    }
    void addEdge(int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    void bfs(int start){
        boolean[] visited=new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while(!q.isEmpty()){
            int vertex = q.poll();
            System.out.print(vertex+" ");
            for(int neighbour:adjList.get(vertex)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
    }
    
    
    void dfs(int start,boolean[] vis){
        vis[start]=true;
        System.out.print(start+" ");
        for(int ele : adjList.get(start)){
            if(!vis[ele]){
                dfs(ele,vis) ;
            }
           
        }
        
    }
}
public class graph{
    public static void main(String args[]){
        Graph g = new Graph(8);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(0,3);
        g.addEdge(1,4);
        g.addEdge(2,5);
        g.addEdge(3,6);
        g.addEdge(4,7);
        g.addEdge(5,7);
        g.addEdge(6,7);
        System.out.println(g.adjList);
        g.bfs(0);
        boolean[] vis = new boolean[8];
        g.dfs(0,vis);
        
        
    }
}