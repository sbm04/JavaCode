package interview;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatedCharacters {
    public static void main(String[] args) {
        String str = "programming";

        // Find repeated characters using Java Streams
        Set<Character> repeatedCharacters = str.chars()
                .mapToObj(c -> (char) c)  // Convert to Stream<Character>
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))  // Group by character and count
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)  // Keep only characters that appear more than once
                .map(Map.Entry::getKey)  // Extract the character
                .collect(Collectors.toSet());  // Collect into a set to avoid duplicates

        // Print the repeated characters
        System.out.println("Repeated characters: " + repeatedCharacters);

    }
}
