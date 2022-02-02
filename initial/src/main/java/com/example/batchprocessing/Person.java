package com.example.batchprocessing;

public class Person {

    private final Long id;
    private final String firstName;
    private final String lastName;

    public Person(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName;
    }
}
