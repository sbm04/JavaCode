package streamQustions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using findFirst()
        Optional<Integer> first = numbers.stream().findFirst();
        first.ifPresent(value -> System.out.println("First element: " + value));

        // Using findAny() in a sequential stream
        Optional<Integer> anySequential = numbers.stream().findAny();
        anySequential.ifPresent(value -> System.out.println("Any element (sequential): " + value));

        // Using findAny() in a parallel stream
        Optional<Integer> anyParallel = numbers.parallelStream().findAny();
        anyParallel.ifPresent(value -> System.out.println("Any element (parallel): " + value));
    }
}
