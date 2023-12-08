package composition;

import javax.swing.plaf.nimbus.State;

public class Student {

    private Address address; // Composition: Student has an Address
    private String name;
    private int age;

    private String State;

    public Student(String streetAddress, int zipCode, String state, String phone, String name, int age) {
        this.address = new Address(streetAddress, zipCode, state, phone); // Creating an Address instance
        this.name = name;
        this.age = age;
        this.State = state;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return State;
    }

    public  void setState(String State) {
        this.State = State;
    }
}
