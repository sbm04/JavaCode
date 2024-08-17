package array;

public class Solution {
//    public static long[][] prefixSumMatrix(int[][] A){
//        int n = A.length;
//        int m = A[0].length;
//        int mod = 10000007;
//        long[][] psum = new long[n][m];
//        //row-wise prefixSum
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                if(j == 0){
//                    psum[i][j] = A[i][j];
//
//                  }
//                else{
//                    psum[i][j] = psum[i][j - 1] + A[i][j];
//                }
//            }
//        }
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++) {
//                System.out.print(psum[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        //column-wise prefixSum
//        for(int j = 0; j < m; j++){
//            for(int i = 1; i < n; i++){
//                psum[i][j] = psum[i - 1][j] + psum[i][j];
//            }
//        }
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++) {
//                System.out.print(psum[i][j] + " ");
//            }
//            System.out.println();
//        }
//        return psum;
//    }
    public static long[][] prefix(int[][] A){
        int n=A.length;
        int m=A[0].length;
        long [][] prefixSum= new long[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                    prefixSum[i][j]=A[i][j];
                }
                else{
                    prefixSum[i][j]= prefixSum[i][j-1]+A[i][j];
                }
            }
        }

        for(int j=0;j<m;j++){
            for(int i=1;i<n;i++){
                prefixSum[i][j]= prefixSum[i-1][j] +prefixSum[i][j];
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++) {
                System.out.print(prefixSum[i][j] + " ");
            }
            System.out.println();
        }

        return prefixSum;
//        1 3 6
//        5 12 21
//        12 27 45
    }
    public static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        int n = A.length;
        int m = A[0].length;
        long[][] psum = prefix(A);

        int[] ans = new int[B.length];
        int q = B.length;
        int mod = 1000000007; // Set the modulo value
        for(int i = 0; i< q; i++){
            int x1 = B[i] - 1;
            int y1 = C[i] - 1;
            int x2 = D[i] - 1;
            int y2 = E[i] - 1;
            long sum = (psum[x2][y2]) % mod;
            if(x1 > 0){
                sum =(sum - psum[x1-1][y2]) % mod;
            }
            if(y1 > 0 ){
                sum = (sum - psum[x2][y1-1]) % mod;
            }
            if(x1 > 0 && y1 > 0) {
                sum = (sum + psum[x1-1][y1-1]) % mod;
            }
            while(sum < 0){
                sum += mod;
            }
            ans[i] = (int)sum;
        }
        return ans;
    }

    public static void main(String[] args) {

        int [][]A = {  {1, 2, 3},
                       {4, 5, 6},
                        {7, 8, 9}   };
        int []B = {1, 2};
        int []C = {1, 2};
        int []D = {2, 3};
        int []E = {2, 3};
        int ans[] = solve( A,  B,  C,  D, E);
        for(int i: ans){
            System.out.print(i+ " ");
        }

    }
}
