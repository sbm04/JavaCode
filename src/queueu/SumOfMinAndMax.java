package queueu;

import java.util.ArrayDeque;
import java.util.Deque;

public class SumOfMinAndMax {
    public static int fun(int []arr, int B){
        int n=arr.length;
        int sum=0;
        Deque<Integer> dMax= new ArrayDeque<>();
        Deque<Integer> dMin= new ArrayDeque<>();

        for(int i=0;i<arr.length;i++){
            if(!dMax.isEmpty() && dMax.peekFirst()== i-B){
                dMax.pollFirst();
            }
            if(!dMin.isEmpty() && dMin.peekFirst()== i-B){
                dMin.pollFirst();
            }
            while(!dMax.isEmpty() && arr[dMax.peekLast()]<arr[i]){
                dMax.pollLast();
            }
            while(!dMin.isEmpty() && arr[dMin.peekLast()]>arr[i]){
                dMin.pollLast();
            }
            dMax.push(i);
            dMin.push(i);
            if(i>=B-1){
                sum+=arr[dMax.peekFirst()] + arr[dMin.peekFirst()];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] ={2, 5, -1, 7, -3, -1, -2};
        int b=4;
        int s= fun(arr,4);
        System.out.println(s);
    }
}
