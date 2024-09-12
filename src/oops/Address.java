package oops;

public class Address {

    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Copy constructor for defensive copying
    public Address(Address address) {
        this(address.street, address.city);
    }

    // Getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    // Setters (if any) should be avoided or made private to maintain immutability in the context of ImmutablePerson
}
