package advds1.array1;

public class MaxSumContiguousSubarray {
    public static int fun1(int arr[]){
        int n= arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int s=0;s<n;s++){
            for(int e=s;e<n;e++){
                int sum=0;
                for(int i=s;i<=e;i++){
                    sum+=arr[i];
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        return maxSum;
    }
    public static int fun2(int arr[]){
        int n= arr.length;
        int maxSum=Integer.MIN_VALUE;
        for(int s=0;s<n;s++){
            int sum=0;
            for(int e=s;e<n;e++) {
               sum+=arr[e];


            }
            maxSum=Math.max(maxSum,sum);

        }
        return maxSum;
    }
    public static int fun3(int arr[]){
        int n= arr.length;
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(currSum>maxSum){
                maxSum=currSum;

            }
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int a[]={4,-1,2,1};
        int result=fun3(a);
        System.out.println(result);

    }
}
