package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentDemo {

        public static void main(String[] args) {
            List<Student> students = Arrays.asList(
                    new Student(1, "Alice", 20, 90.5),
                    new Student(2, "Bob", 22, 88.0),
                    new Student(3, "Charlie", 21, 91.0),
                    new Student(4, "David", 23, 85.0)
            );



            Student secondHighestScoreStudent1  =students.stream()
                        .sorted((s1, s2) -> Double.compare(s2.getScore(), s1.getScore()))
                        .skip(1)
                        .findFirst()
                        .orElse(null);

            System.out.println(secondHighestScoreStudent1);
        }

}
