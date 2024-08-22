package com.neoteric.functions220824.functiondemo.model;

public class Employee {
    public String firstName;
    public String lastName;
    public String mobileNo;
    public int age;

    public String getFirstName() {
        return firstName;
    }

    public Employee(String firstName, String lastName, String mobileNo, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNo = mobileNo;
        this.age = age;
    }

}
