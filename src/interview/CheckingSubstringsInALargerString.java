package interview;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class CheckingSubstringsInALargerString {
    public static List<Boolean> checkSubstrings(String[] strings, String s) {
        List<Boolean> result = new ArrayList<>();
        int start = 0;

        for (String substring : strings) {
            int pos = s.indexOf(substring, start);
            if (pos != -1) {
                result.add(true);
                start = pos + substring.length();
            } else {
                result.add(false);
            }
        }

        return result;
    }
    public static boolean fun(String main, String str){
        String []mainWord= main.split("[\\s,.!?]+");
        Set<String> wordSet = new HashSet<>();
        for(String word : mainWord){
            wordSet.add(word);
        }
        if(wordSet.contains(str)){
            return true;
        }

        return false;


    }

    public static void main(String[] args) {
        String mainString = "This is a sample string for testing.";
        System.out.println(fun(mainString,"sample"));

        System.out.println("-------------------");

        String[] strings = {"hello", "world", "foo"};
        String s = "helloworldfoo";

        List<Boolean> result = checkSubstrings(strings, s);
        System.out.println(result);  // Output: [true, true, true]

    }
}
