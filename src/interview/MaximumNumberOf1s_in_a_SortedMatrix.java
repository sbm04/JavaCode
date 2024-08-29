package interview;

public class MaximumNumberOf1s_in_a_SortedMatrix {
    public static  int lowerBound(int []mat,int n, int x){
        int low=0;
        int high=mat.length-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(mat[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;

    }
    public static int rowWithMax1s(int mat[][], int n ,int m){
        int maxOnes=0;
        int index=-1;
        //  n *  log2 m
        for(int i=0;i<n;i++){
            int currOnes=m-lowerBound(mat[i],m,1);
            if(currOnes>maxOnes){
                maxOnes=currOnes;
                index=i;
            }

        }
        return index;

    }
    public static void main(String[] args) {
        int mat[][] = { {0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        int n= mat.length;
        int m=mat[0].length;
        int index=rowWithMax1s(mat,n,m);

        System.out.println("Index " + index);

    }
}
