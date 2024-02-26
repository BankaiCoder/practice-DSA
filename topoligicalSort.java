import java.util.ArrayList;
import java.util.Stack;

public class topoligicalSort {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }

    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        construction(graph);

        topSort(graph, v);
    }

    public static void construction(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    // also called modified dfs
    public static void topSortUtil(ArrayList<Edge> graph[], boolean[] vis, int curr, Stack<Integer> stack) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!vis[e.dest]) {
                topSortUtil(graph, vis, e.dest, stack);
            }

        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[], int v) {
        boolean[] vis = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                topSortUtil(graph, vis, i, stack);
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
