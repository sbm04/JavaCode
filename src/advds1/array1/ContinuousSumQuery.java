package advds1.array1;

public class ContinuousSumQuery {
    public static int[] fun1(int A,int B[][]){
        //Brute force
        int ans[] = new int[A];
        int r=B.length;
        int C=B[0].length;
        for(int i=0;i<r;i++){
            int L=B[i][0]-1;
            int R=B[i][1]-1;
            int p=B[i][2];
            for(int s=L;s<=R;s++){
                ans[s]+=p;
            }
        }
        return ans;
    }
    public static int[] fun2(int A,int B[][]){
        //Brute force
        int ans[] = new int[A];
        int r=B.length;
        int C=B[0].length;
        for(int i=0;i<r;i++){
            int L=B[i][0]-1;
            int R=B[i][1]-1;
            int p=B[i][2];
            ans[L]+=p;
            if(R<A-1){
                ans[R+1]-=p;
            }

        }
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i]+ans[i-1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int A = 5;
        int [][]B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int ans[]=fun2(A,B);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
