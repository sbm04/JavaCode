package queueu;

import java.util.ArrayDeque;
import java.util.Deque;

public class newSumOfMinAndMax {
    public static int solve(int[] A, int B) {
        int mod = 1000 * 1000 * 1000 + 7;
        // maintain increasing order of values from front to rear
        Deque< Integer > minn = new ArrayDeque< Integer >();
        // maintain decreasing order of values from front to rear
        Deque < Integer > maxx = new ArrayDeque < Integer > ();
        int i = 0;

        // Process first window of size B
        for (; i < B; i++) {
            // Remove all previous greater elements that are useless.
            while (minn.size() > 0 && A[minn.getLast()] >= A[i]) {
                minn.removeLast();
            }
            // Remove all previous smaller that are elements are useless.
            while (maxx.size() > 0 && A[maxx.getLast()] <= A[i]) {
                maxx.removeLast();
            }
            // Add current element at rear of both deque
            minn.addLast(i);
            maxx.addLast(i);
        }
        long sum = A[minn.getFirst()] + A[maxx.getFirst()];

        while (i < A.length) {
            // remove all previous greater element that are useless
            while (minn.size() > 0 && A[minn.getLast()] >= A[i]) {
                minn.removeLast();
            }
            // remove all previous smaller that are elements are useless
            while (maxx.size() > 0 && A[maxx.getLast()] <= A[i]) {
                maxx.removeLast();
            }
            // Add current element at rear of both deque
            minn.addLast(i);
            maxx.addLast(i);
            // Remove all elements which are out of this window
            while (i - minn.getFirst() >= B) {
                minn.removeFirst();
            }
            while (i - maxx.getFirst() >= B) {
                maxx.removeFirst();
            }
            // Element at the front of the deque are the largest and smallest  element of previous window respectively
            sum += A[maxx.getFirst()] + A[minn.getFirst()];
            sum %= mod;
            i++;
        }
        sum += mod;
        sum %= mod;
        return (int) sum;
    }
    public static void main(String[] args) {
        int arr[] ={2, 5, -1, 7, -3, -1, -2};
        int b=4;
        int s= solve(arr,4);
        System.out.println(s);
    }

}
