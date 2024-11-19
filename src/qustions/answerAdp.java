package qustions;
import java.util.*;
public class answerAdp {
    public static List<Set<Integer>> groupDistinctRows(int[] nums) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create the 2D list of sets
        List<Set<Integer>> result = new ArrayList<>();
        //        1 3 <- it
        //        2 1
        //        3 2
        //        4 1

//        {1,2,3,4}
//        {1, 3}
//        {1,}

        while (!frequencyMap.isEmpty()) {
            Set<Integer> row = new HashSet<>();

            // Collect distinct elements for the current row
            for (Iterator<Integer> it = frequencyMap.keySet().iterator(); it.hasNext(); ) {
                int num = it.next();
                row.add(num);

                // Decrease frequency and remove if it reaches zero
                frequencyMap.put(num, frequencyMap.get(num) - 1);
                if (frequencyMap.get(num) == 0) {
                    it.remove();
                }
            }

            result.add(row);
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        List<Set<Integer>> output = groupDistinctRows(nums);

        // Print the result
        for (Set<Integer> row : output) {
            System.out.println(row);
        }
    }
}
