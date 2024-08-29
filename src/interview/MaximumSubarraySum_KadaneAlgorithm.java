package interview;

public class MaximumSubarraySum_KadaneAlgorithm {

    //Kadane’s Algorithm (O(n) time and O(1) Space):
    public static int fun(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            if(sum>maxSum){
                maxSum=sum;
            }
        }
        return maxSum;
    }
    public static int maxSubArraySum(int arr[]) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxSum=Math.max(maxSum,sum);
            sum=Math.max(sum,0);
        }
        return maxSum;
    }
    public static void maxSubArraySumWithIndex(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int n=arr.length;
        int start=0;
        int end=0;
        int itr=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
                itr=i+1;
            }
            if(sum>maxSum){
                maxSum=sum;
                start=itr;
                end=i;
            }
        }
        System.out.println("Maximum contiguous sum is "
                + maxSum);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }
    public static void maxSubArraySumDp(int[] a) {
        int size = a.length;
        int[] dp = new int[size]; // Create an array to store intermediate results
        dp[0] = a[0]; // Initialize the first element of the intermediate array with the first element of the input array
        int ans = dp[0]; // Initialize the answer with the first element of the intermediate array
        for (int i = 1; i < size; i++) {
            // Calculate the maximum of the current element and the sum of the current element and the previous result
            dp[i] = Math.max(a[i], a[i] + dp[i - 1]);
            // Update the answer with the maximum value encountered so far
            ans = Math.max(ans, dp[i]);
        }
        // Print the maximum contiguous array sum
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxSubArraySumWithIndex(arr);
        int s=maxSubArraySum(arr);
        System.out.println(s);

    }
}
