package graph.graph2;

import java.util.LinkedList;

public class RottenOranges {
    public class pair{
        int row;
        int col;
        int time;
        public pair(int row, int col, int time){
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }
    public int solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int cntFesh=0;
        LinkedList<pair> queue = new LinkedList<pair>();

        boolean vis[][]= new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(A[i][j] == 2){
                    vis[i][j] = true;
                    queue.add(new pair(i, j, 0));

                }
                else if(A[i][j] == 1){
                    cntFesh++;
                }
            }
        }
        int cnt=0;
        int maxTime=0;

        while(!queue.isEmpty()){
            pair pair = queue.poll();
            int row = pair.row;
            int col = pair.col;
            int time = pair.time;
            maxTime= Math.max(maxTime,time);
            int []dx={1,-1,0,0};
            int []dy={0,0,1,-1};
            for (int i = 0; i < 4; i++) {
                int newRow = row + dx[i];
                int newCol = col + dy[i];
                if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && vis[newRow][newCol]==false && A[newRow][newCol] == 1 ){
                    vis[newRow][newCol] = true;
                    queue.add(new pair(newRow, newCol, time+1));
                    cnt++;
                }
            }
        }
        if(cnt!=cntFesh){
            return -1;
        }
        return maxTime;

    }
    public static void main(String[] args) {
        int [][]A = {{2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        System.out.println(new RottenOranges().solve(A));

    }
}
