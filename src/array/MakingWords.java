package array;

import java.util.HashMap;
import java.util.Map;

public class MakingWords {
    public static boolean canFormWord(String word, String[] arr) {
         Map<String, Integer> wordFreq = new HashMap<String, Integer>();
         for(String s:arr){
             wordFreq.put(s,wordFreq.getOrDefault(s,0) + 1);

         }
         Map.Entry<String, Integer> entry = wordFreq.entrySet().iterator().next();
         for(Map.Entry<String, Integer> e:wordFreq.entrySet()){
             System.out.println(e.getKey()+" "+e.getValue());
         }


      return true;
    }

    public static void main(String[] args) {
        String[] arr = {"hello", "world", "po", "pu", "lar"};

        System.out.println(canFormWord("helloworld", arr));   // true
//        System.out.println(canFormWord("worldhello", arr));   // true
//        System.out.println(canFormWord("helloworldlar", arr)); // true
//        System.out.println(canFormWord("popopopopopopopolarlarworldlarhello", arr)); // true
//        System.out.println(canFormWord("hello world", arr));  // false
//        System.out.println(canFormWord("helloworld!", arr));  // false
    }
}
