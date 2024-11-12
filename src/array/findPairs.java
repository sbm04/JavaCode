package array;

import java.util.HashMap;

public class findPairs {
    public static void findPairsBruteForce(int[] arr, int target){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
    }
    public static void findPairsOptimized(int [] arr, int target){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            int comp= target - arr[i];
            if(map.containsKey(comp)){
                System.out.println("Pair: (" + comp + ", " +arr[i] + ")");
            }
            map.put(arr[i], i);
        }

    }

    public static void main(String[] args) {
        // Example array and target
        int[] arr = {2, 7, 11, 15, -2, 4, 8, 5};
        int target = 9;

        // Call brute force approach
        findPairsBruteForce(arr, target);
        System.out.println(" next ");
        // Call optimized approach
        findPairsOptimized(arr, target);
    }
}
