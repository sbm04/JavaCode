package graph;

import java.util.*;

class TopologicalSortChat {
    private static int V; // Number of vertices
    private static  LinkedList<Integer> adj[]; // Adjacency list

    // Constructor
    TopologicalSortChat(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList<>();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // The function to do Topological Sort
    static void topologicalSort() {
        int inDegree[] = new int[V];

        // Initialize in-degree of all vertices
        for (int i = 0; i < V; i++) {
            for (int node : adj[i]) {
                inDegree[node]++;
            }
        }

        // Enqueue all vertices with in-degree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        int count = 0;

        // List to store result
        List<Integer> topOrder = new ArrayList<>();

        // One by one dequeue vertices from the queue
        while (!queue.isEmpty()) {
            int u = queue.poll();
            topOrder.add(u);

            // Iterate through all neighboring nodes of dequeued node u
            for (int node : adj[u]) {
                if (--inDegree[node] == 0) {
                    queue.add(node);
                }
            }

            count++;
        }

        // Check if there was a cycle
        if (count != V) {
            System.out.println("There exists a cycle in the graph");
            return;
        }

        // Print topological order
        for (int i : topOrder) {
            System.out.print(i + " ");
        }
    }

    // Driver method
    public static void main(String args[]) {
        TopologicalSortChat g = new TopologicalSortChat(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        System.out.println("Topological sort of the given graph:");
        g.topologicalSort();
    }
}
