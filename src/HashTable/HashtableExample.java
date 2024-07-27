package HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Insert key-value pairs into the Hashtable
        hashtable.put("Alice", 30);
        hashtable.put("Bob", 25);
        hashtable.put("Charlie", 35);

        // Access elements in the Hashtable
        System.out.println("Value for Alice: " + hashtable.get("Alice"));
        System.out.println("Value for Bob: " + hashtable.get("Bob"));

        // Iterate over the key-value pairs in the Hashtable
        System.out.println("Key-Value pairs in the Hashtable:");
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Remove an element from the Hashtable
        hashtable.remove("Charlie");
        System.out.println("Hashtable after removing Charlie: " + hashtable);

        // Check if a key is present in the Hashtable
        System.out.println("Contains key 'Alice': " + hashtable.containsKey("Alice"));
        System.out.println("Contains key 'Charlie': " + hashtable.containsKey("Charlie"));
    }
}

