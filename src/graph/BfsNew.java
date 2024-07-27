package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BfsNew {
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[] vis;

    public static void createAdj(ArrayList<ArrayList<Integer>> list, int A) {
        adj = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            adj.add(new ArrayList<>());
        }
        for (ArrayList<Integer> edge : list) {
            int start = edge.get(0);
            int end = edge.get(1);
            adj.get(start).add(end);
        }
    }

    static Queue<Integer> queue = new LinkedList<>();

    public static void bfs(int node) {
        queue.add(node);
        vis[node] = true;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int v : adj.get(u)) {
                if (!vis[v]) {
                    queue.add(v);
                    vis[v] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int A = 6;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(1, 2)),
                        new ArrayList<>(Arrays.asList(4, 1)),
                        new ArrayList<>(Arrays.asList(2, 4)),
                        new ArrayList<>(Arrays.asList(3, 4)),
                        new ArrayList<>(Arrays.asList(5, 2)),
                        new ArrayList<>(Arrays.asList(1, 3))
                )
        );
        createAdj(list, A);
        vis = new boolean[A + 1];
        bfs(1);
        if (vis[5]) {
            System.out.println("Visited");
        } else {
            System.out.println("Not visited");
        }
    }
}
