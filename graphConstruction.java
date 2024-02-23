import java.util.*;

public class graphConstruction {

    static class Edge {
    int src;
    int dest;
    int wt;

    public Edge(int s, int d, int w){
        this.dest = d;
        this.src = s;
        this.wt = w;
    }
        
    }
    public static void main(String[] args) {
        int v = 4;

        ArrayList<Edge> graph[] = new ArrayList[v];
        construction(graph);

        for (int i = 0; i < v; i++) {
            System.out.print("Neighbours of vertex " + i + ": ");
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.print(e.dest + " (Weight: " + e.wt + ") ");
            }
            System.out.println(); // Move to the next line for the next vertex
        }
    }
    public static void construction(ArrayList<Edge> graph[]){
        
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3, 2,-1));
    }
}
