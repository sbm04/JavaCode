package qustions;
import java.util.*;
public class HashMapQuestions {

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 1, 2, 3, 1};

        // Map to track the next group index for each number
        HashMap<Integer, Integer> freMap = new HashMap<>();
        List<List<Integer>> al = new ArrayList<>();

        for (int num : array) {
            // Determine the group index for the current number
            int groupIndex = freMap.getOrDefault(num, al.size());

            // If the groupIndex points to a new group, create it
            if (groupIndex == al.size()) {
                al.add(new ArrayList<>());
            }

            // Add the number to the correct group
            al.get(groupIndex).add(num);

            // Update the map for the next occurrence of this number
            freMap.put(num, groupIndex + 1);
        }

        // Printing the result
        for (List<Integer> group : al) {
            System.out.println(group);
        }
    }
}
