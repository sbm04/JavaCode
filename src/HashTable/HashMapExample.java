package HashTable;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

        public static void main(String[] args) {
            // Create a HashMap
            HashMap<String, Integer> map = new HashMap<>();
            // Insert key-value pairs into the HashMap
            map.put("Alice", 30);
            map.put("Bob", 25);
            map.put("Charlie", 35);

            // Access elements in the HashMap
            System.out.println("Value for Alice: " + map.get("Alice"));
            System.out.println("Value for Bob: " + map.get("Bob"));

            // Iterate over the key-value pairs in the HashMap
            System.out.println("Key-Value pairs in the HashMap:");
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Remove an element from the HashMap
            map.remove("Charlie");
            System.out.println("HashMap after removing Charlie: " + map);

            // Check if a key is present in the HashMap
            System.out.println("Contains key 'Alice': " + map.containsKey("Alice"));
            System.out.println("Contains key 'Charlie': " + map.containsKey("Charlie"));
        }

}
