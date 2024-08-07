package queueu;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class uniqueLetter {
    public static String solve(String s){
        HashMap<Character,Integer> hmap= new HashMap<>();
        Queue<Character> queue= new LinkedList<>();
        String ans="";
        for(char A :s.toCharArray()){
            hmap.put(A, hmap.getOrDefault(A,0)+1);
            queue.add(A);
            while(!queue.isEmpty() && hmap.get(queue.peek())>1){
                queue.poll();

            }
            if(!queue.isEmpty()){
                ans+=queue.peek();
            }else{
                ans+='#';
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s= solve("abcabc");
        System.out.println(s);
    }
}
