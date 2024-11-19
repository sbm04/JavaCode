package qustions;
import java.util.*;

public class mapQustion {

    public static void fun(List<String> str){

        HashMap<String,Integer> freqMap= new HashMap<>();


        for(String str1: str){
            freqMap.put(str1,freqMap.getOrDefault(str1,0) +1);
        }

        for(Map.Entry<String,Integer> ety: freqMap.entrySet()){
            System.out.println("Key " + ety.getKey() +  " Value " + ety.getValue());
        }



    }
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("Java");
        str.add("Python");
        str.add("Java");
        str.add("Ruby");
        str.add("scala");
        str.add("Ruby");
        str.add("c");
        fun(str);

    }
}
