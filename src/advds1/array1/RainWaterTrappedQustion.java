package advds1.array1;

public class RainWaterTrappedQustion {
    public static int fun1(int []arr){
        int n = arr.length;
        int ans = 0;
        for(int i=1;i<n;i++){
            int lmax=0;
            for(int l=0;l<i;l++){
                lmax=Math.max(lmax,arr[l]);
            }
            int rmax=0;
            for(int r=n-1;r>i;r--){
                rmax=Math.max(rmax,arr[r]);
            }
            int water=Math.min(lmax,rmax)-arr[i];
            if(water>0){
              ans+=water;
            }

        }
        return ans;

    }
    public static int fun2(int []arr){
        int n = arr.length;
        int ans = 0;
        int []lmax = new int[n];
        lmax[0] = arr[0];
        for(int i=1;i<n;i++){
            lmax[i] = Math.max(lmax[i-1],arr[i]);
        }
        int []rmax = new int[n];
        rmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i] = Math.max(rmax[i+1],arr[i]);
        }
        for (int i=0;i<n;i++){
            int water = Math.min(lmax[i],rmax[i])-arr[i];
            if(water>0){
                ans+=water;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

       int[] A = {5, 4, 1, 4, 3, 2, 7};
       System.out.println(fun2(A));

    }
}
