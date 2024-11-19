package qustions;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


//convert arry to list of sets
//
//
//You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:
//
//The 2D array should contain only the elements of the array nums.
//Each row in the 2D array contains distinct integers.
//The number of rows in the 2D array should be minimal.
//Return the resulting array. If there are multiple answers, return any of them.
//
//Note that the 2D array can have a different number of elements on each row.
//
//        Example 1:
//
//Input: nums = [1,3,4,1,2,3,1]
//Output: [[1,3,4,2],[1,3],[1]]
//Explanation: We can create a 2D array that contains the following rows:
//        - 1,3,4,2
//        - 1,3
//        - 1
//All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
//It can be shown that we cannot have less than 3 rows in a valid array.


public class ConverArryToListOfSets {

    public static void fun(int arr[]){
        HashMap<Integer, Integer> fmap = new HashMap<>();
        int maxFre=0;
        for(int integer : arr){
            fmap.put(integer,fmap.getOrDefault(integer,0)+1);
            maxFre=Math.max(maxFre,fmap.get(integer));

        }
//        for(Map.Entry<Integer, Integer> entry:fmap.entrySet()){
//            System.out.println(entry.getKey() + " "+ entry.getValue() );
//        }

//        1 3
//        2 1
//        3 2
//        4 1

//        {1,2,3,4}
//        {1, 3}
//        {1,}
        ArrayList<ArrayList<Integer >> result = new ArrayList<>();
        for(int i=0;i<maxFre;i++){
            result.add(new ArrayList<>());
        }
        for(Map.Entry<Integer, Integer> entry : fmap.entrySet()){
            for(int i=0;i< entry.getValue();i++){
                result.get(i).add(entry.getKey());
            }
        }
       for(ArrayList<Integer> set : result){
           for(Integer integer : set){
               System.out.print(integer+" ");
           }
           System.out.println();
       }
    }
    public static void main(String[] args) {
        int arr[]= {1,3,4,1,2,3,1};
        fun(arr);

    }
}
