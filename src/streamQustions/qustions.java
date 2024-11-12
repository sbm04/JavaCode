package streamQustions;

import java.util.*;
import java.util.stream.Collectors;

public class qustions {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLen = names.stream().map(s-> s.length())//map(String::length)//
                .collect(Collectors.toList());
        nameLen.forEach(System.out::println);

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Alice", "Bob"),
                Arrays.asList("Charlie", "David")
        );
        List<String> namesFlat = namesNested.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        namesFlat.forEach(i-> System.out.print(i+ " "));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.print(sum);

        List<String> strings = Arrays.asList("1", "2", "a");
        List<Integer> integers = strings.stream()
                .map(str -> {
                    try {
                        return Integer.parseInt(str);
                    } catch (NumberFormatException e) {
                        return 0; // or handle differently
                    }
                })
                .collect(Collectors.toList());

        integers.forEach(i-> System.out.print(i));




    }
}
