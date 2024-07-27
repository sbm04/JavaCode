package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        // Access elements in the ArrayList
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Iterate over the ArrayList
        System.out.println("ArrayList elements:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Remove an element from the ArrayList
        arrayList.remove("Banana");
        System.out.println("ArrayList after removing Banana: " + arrayList);

        // Check if the ArrayList contains an element
        System.out.println("Contains 'Apple': " + arrayList.contains("Apple"));
    }
}
