import java.util.*;

public class bfs {

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

    // Create a graph with some sample edges
    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Sample undirected graph (you can change or extend this)
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

    // BFS function
    public static void bfsTraversal(ArrayList<Edge>[] graph, int start, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (Edge e : graph[curr]) {
                    q.add(e.dest);
                }
            }
        }
    }
    public static void topsort(ArrayList<Edge>[] graph, int v, boolean[] vis) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                topsortutil(graph, i, vis, st);
            }
        }

        // Print after all vertices processed
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void topsortutil(ArrayList<Edge>[] graph, int curr, boolean[] vis, Stack<Integer> st) {
        vis[curr] = true;

        for (int j = 0; j < graph[curr].size(); j++) {
            Edge e = graph[curr].get(j);
            if (!vis[e.dest]) {
                topsortutil(graph, e.dest, vis, st);
            }
        }

        st.push(curr);
    }
}

    public static void main(String[] args) {
        int V = 7; // number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        boolean[] visited = new boolean[V];
        System.out.print("BFS Traversal: ");
        bfsTraversal(graph, 0, visited); // Start from vertex 0
        topsort(graph,V,visited);
    }
}
