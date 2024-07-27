package DeepCopyAndShellowCopy;

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Shallow Copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep Copy
    public Person deepClone() {
        return new Person(this.name, new Address(this.address.city, this.address.country));
    }
}
