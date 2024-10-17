package String;

import java.util.*;
import java.util.ArrayList;

public class PermutationsOfAString {


    public static void getPermutations(int start, int [] nums, List<List<Integer>> ans) {

        if(start == nums.length) {
            List<Integer> ds= new ArrayList<>();
            for(int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }


        for(int i = start; i < nums.length; i++) {
           swap(start,i,nums);
           getPermutations(start+1,nums,ans);
           swap(start,i,nums);
        }

    }
    public  static void swap( int i, int j,int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {

        List<List<Integer>> ans= new ArrayList<>();
        int[] nums= {1,2,3};

        getPermutations(0,nums,ans);
        System.out.println(ans);


    }

















}
