package oops;

public class ImmutablePerson {
    // Step 2: Make all fields final
    private final String name;
    private final int age;
    private final Address address; // Assume Address is a mutable object

    // Step 4: Initialize all fields in the constructor
    public ImmutablePerson(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        // Step 5: Defensive copy of the mutable object
        this.address = new Address(address);
    }

    // Step 3: No setter methods

    // Provide getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        // Step 5: Return a defensive copy of the mutable object
        return new Address(address);
    }

    // Address class should also implement immutability, or provide defensive copies
}
