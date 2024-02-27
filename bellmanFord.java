import java.util.*;

public class bellmanFord {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        construction(graph);
        bellmanFordCode(graph, 0, v);
    }

    public static void construction(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,4));

        graph[1].add(new Edge(1, 2,-4));

        graph[2].add(new Edge(2, 3,2));

        graph[3].add(new Edge(3, 4,4));

        graph[4].add(new Edge(4, 1,-1));

    }


    public static void bellmanFordCode(ArrayList<Edge> graph[], int src, int V) {
        int[] dist = new int[V];
        for (int i = 0; i < V; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        for(int k =0;k<V-1;k++){
            for(int i=0;i<V;i++){
                for(int j=0;j<graph[i].size();j++){
                    Edge e = graph[i].get(j);

                    int u = e.src;
                    int v = e.dest;

                    if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
                        dist[v] = dist[u]+e.wt;
                    }
                }
            }
        }
        // detect -ve cycle if all the distance is -ve
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);

                int u = e.src;
                int v = e.dest;

                if(dist[u] != Integer.MAX_VALUE && dist[u]+e.wt < dist[v]){
                    System.out.println("negative weight cycle");
                }
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }

    }
}