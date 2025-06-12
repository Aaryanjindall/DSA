import java.util.*;

public class dfs {

    // ---------- Edge Definition ----------
    static class Edge {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }

    // ---------- Graph Creation ----------
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected sample graph (same as BFS example)
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    // ---------- DFS Traversal (recursive) ----------
    static void dfsTraversal(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        // Current vertex ko visit karo
        System.out.print(curr + " ");
        visited[curr] = true;

        // Saare neighbours pe chale jao (depth‑wise)
        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                dfsTraversal(graph, e.dest, visited);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;                         // vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        boolean[] visited = new boolean[V];
        System.out.print("DFS Traversal: ");
        dfsTraversal(graph, 0, visited);   // start from 0
    }
}
