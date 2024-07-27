package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    static ArrayList<ArrayList<Integer>> adj ;
    static boolean vis[];
    public static void creatAdj(ArrayList<ArrayList<Integer>> list,int A){
        adj = new ArrayList<>();
        for(int i=0;i<A;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<list.size();i++){
            int start=list.get(i).get(0);
            int end=list.get(i).get(1);
            adj.get(start).add(end);

        }


    }
    static Queue<Integer> queue= new LinkedList<>();
    public static void bfs(int node ){
        queue.add(node);
        vis[node]=true;
        while(!queue.isEmpty()){
            int u=queue.poll();

                for(int i=0;i<adj.get(u).size();i++){
                    int v=adj.get(u).get(i);
                    if(vis[v]==false) {
                        queue.add(v);
                        vis[v] = true;
                    }
                }


        }


    }
    public static void main(String[] args) {
        int A=6;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(1,2)),
                        new ArrayList<>(Arrays.asList(4,1)),
                        new ArrayList<>(Arrays.asList(2,4)),
                        new ArrayList<>(Arrays.asList(3,4)),
                        new ArrayList<>(Arrays.asList(5,2)),
                        new ArrayList<>(Arrays.asList(1,3))

                )
        );
        creatAdj(list,A);
        vis= new boolean[A+1];
        bfs(1);
        if(vis[5]==true){
            System.out.println(" visited ");
        }
        else{
            System.out.println(" Not visited ");
        }




    }
}
