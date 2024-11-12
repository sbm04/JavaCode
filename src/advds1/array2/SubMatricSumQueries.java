package advds1.array2;

public class SubMatricSumQueries {
    public static int[]  fun1(int arr[][], int []B, int C[], int D[], int E[]){
        int result[]= new int[2];
        for(int q=0;q<B.length;q++) {
            int b=B[q]-1;
            int c=C[q]-1;
            int d=D[q]-1;
            int e=E[q]-1;
            int sum=0;
            for (int i = b; i <=d ; i++) {
                for (int j = c; j <=e; j++) {
                   sum+=arr[i][j];
                }
            }
            result[q]=sum;
        }
        return result;
    }
    public static void main(String[] args) {
       int[][] A = {  {1, 2, 3},
               {4, 5, 6},
               {7, 8, 9} };


        int[] B = {1, 2};
        int[]C = {1, 2};
        int[] D = {2, 3};
        int[] E = {2, 3};
        int result[]=fun1(A,B,C,D,E);

        for (int i : result) {
            System.out.println(i);
        }
    }
}
