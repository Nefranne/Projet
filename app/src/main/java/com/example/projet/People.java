package com.example.projet;

public class People {
    private String FirstName;
    private String LastName;
    private int age;
    private int size;

    public People(String firstName, String lastName, int age, int size) {
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.size = size;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
