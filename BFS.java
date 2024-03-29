import java.util.*;

public class BFS {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.dest = d;
            this.src = s;
        }
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        construction(graph);
        boolean vis[] = new boolean[v];
       // bfs(graph, v);--> this is for connected graph
        for(int i=0;i<v;i++){//-->this can work with both connected and dissconnected graph.
            if(vis[i] == false){
                bfs(graph,v,vis,i);
            }
        }
        System.out.println();
    }

    public static void construction(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
       
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[5].add(new Edge(6, 5));

    }

    public static void bfs //(ArrayList<Edge> graph[], int v)
    (ArrayList<Edge> graph[],int v,boolean vis[],int start){
        Queue<Integer> q = new LinkedList<>();
        //boolean vis[] = new boolean[v];-->if you only working with connected graph
        //q.add(0);//if your are working with connected graph
        q.add(start);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vis[curr] == false){
                System.out.print(curr+" ");
                vis[curr] = true;

                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
}
