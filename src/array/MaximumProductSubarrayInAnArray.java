package array;

public class MaximumProductSubarrayInAnArray {
    public static int fun(int arr[]){
        int n=arr.length;
        int pre=1;
        int suff=1;
        int ans=0;
        for(int i=0;i<n;i++){
            if(pre==0){
                pre=1;
            }
            if(suff==0){
                suff=1;
            }
            pre=pre*arr[i];
            suff=suff*arr[i];
            ans=Math.max(ans,Math.max(pre,suff));

        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[]={-2, 3, 4, -1, 0, -2, 3, 1, 4, 0, 4, 6, -1, 4};

        System.out.println(fun(arr));
    }
}
