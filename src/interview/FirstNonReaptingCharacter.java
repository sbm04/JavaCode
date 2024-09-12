package interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FirstNonReaptingCharacter {
    public static char fun(String s){
        HashMap<Character, Integer> hmap= new HashMap<>();
        for(int i=0;i<s.length();i++){
            hmap.put(s.charAt(i),hmap.getOrDefault(s.charAt(i),0)+1);

        }
        for(Map.Entry<Character,Integer> st : hmap.entrySet()){
            char c=st.getKey();
            int i = st.getValue();
            if(i<=1){
                return c;
            }
        }
        return '.';
    }
    public static char fun1(String str) {
        HashSet ones = new HashSet();
        HashSet repeated = new HashSet();
         for(char s : str.toCharArray() ){
             if(repeated.contains(s)){
                 continue;
             }
             if(ones.contains(s)){
                 repeated.add(s);
                 ones.remove(s);

             }
             else{
                 ones.add(s);
             }
         }
         for (char s: str.toCharArray()){
             if(ones.contains(s)){
                 return s;
             }
         }
         return  '-';
    }

    public static void main(String[] args) {
        String str= "swiss";

        char s = fun1(str);
        System.out.println(s);
    }
}
