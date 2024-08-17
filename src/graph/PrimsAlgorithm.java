package graph;

import java.util.*;
import java.util.ArrayList;
import java.util.PriorityQueue;

class  pair implements Comparable<pair>{
    int weight;
    int vertex;
    public pair(int x,int y){
        weight=x;
        vertex=y;
    }


    @Override
    public int compareTo(pair o) {
        return this.weight-o.weight;
    }
}


public class PrimsAlgorithm {
    static boolean vis[];
    static ArrayList<ArrayList<pair>> adj;
    static int ans=0;
    public static void prism(int v){
          vis=new boolean[6];
        PriorityQueue<pair> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new pair(0,v));
        while(!priorityQueue.isEmpty()){
            pair p=priorityQueue.poll();
            int ver =p.vertex;
            int wgt = p.weight;
            if(vis[ver]==true){
                continue;
            }
            vis[ver]=true;
            ans+=wgt;
            for(int i=0;i<adj.get(ver).size();i++){
                int ele= adj.get(ver).get(i).vertex;
                int wt = adj.get(ver).get(i).weight;
                if(vis[ele]==false){
                   priorityQueue.add(new pair(wt,ele));
                }
            }



        }
        System.out.println(ans);

    }

    public static void main(String[] args) {
        int A=6;
        adj = new ArrayList<>();
        for(int i=0;i<A;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(new pair(7,2));

        adj.get(2).add(new pair(7,1));

        adj.get(1).add(new pair(8,4));

        adj.get(4).add(new pair(8,1));

        adj.get(2).add(new pair(3,4));
        adj.get(4).add(new pair(3,2));

        prism(1);


    }
}
