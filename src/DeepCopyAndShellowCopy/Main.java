package DeepCopyAndShellowCopy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("New York", "USA");
        Person original = new Person("John", address);

        // Shallow Copy
        Person shallowCopy = (Person) original.clone();

        // Deep Copy
        Person deepCopy = original.deepClone();

        // Modifying the original object's address
        original.address.city = "Los Angeles";

        // Printing results
        System.out.println("Original Address: " + original.address.city);       // Output: Los Angeles
        System.out.println("Shallow Copy Address: " + shallowCopy.address.city); // Output: Los Angeles
        System.out.println("Deep Copy Address: " + deepCopy.address.city);       // Output: New York
    }
}
