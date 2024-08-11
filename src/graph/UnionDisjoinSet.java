package graph;

import java.nio.file.Paths;

public class UnionDisjoinSet {
    private int[] parent;
    public UnionDisjoinSet(int n){
        parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
    }
    public int find(int x){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=find(parent[x]);
    }
    public boolean union(int x, int y){
       int rootX=find(x);
       int rootY=find(y);
       if(rootX==rootY){
           return false;
       }
       if(rootX<rootY){
           parent[rootY]=rootX;
       }
       else{
           parent[rootX]=rootY;
       }
       return true;

    }
    public static void main(String[] args) {
        int n=5;
        UnionDisjoinSet ds= new UnionDisjoinSet(n);
        ds.union(0, 2);
        ds.union(4, 2);
        ds.union(3, 1);
        if ( ds.find(0)==ds.find(2)) {
            System.out.println("0 and 2 are in the same set.");
        } else {
            System.out.println("0 and 2 are in different sets.");
        }

        if (ds.find(0)==ds.find(3)) {
            System.out.println("0 and 3 are in the same set.");
        } else {
            System.out.println("0 and 3  are in different sets.");
        }



    }
}
