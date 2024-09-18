package StreamsAndLambdas.Qustions;
import java.util.*;
import java.util.stream.Collectors;

public class CollectMethodQuestion1 {
    public static void main(String[] args) {
//        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
//
//        // What does the following code snippet do?
//        String result = fruits.stream()
//                .collect(Collectors.joining(", "));
//
//        System.out.println("Result: " + result);

//        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
//
//        // What does the following code snippet do?
//        Map<Integer, List<String>> groupedByLength = fruits.stream()
//                .collect(Collectors.groupingBy(String::length));
//
//        System.out.println("Result: " + groupedByLength);
//        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
//
//        // What does the following code snippet do?
//        Set<String> uniqueFruits = fruits.stream()
//                .collect(Collectors.toSet());
//
//        System.out.println("Result: " + uniqueFruits);

        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // What does the following code snippet do?
        boolean allMatch = words.parallelStream()
                .allMatch(w -> w.length() > 3);

        System.out.println("All match: " + allMatch);
    }
}
