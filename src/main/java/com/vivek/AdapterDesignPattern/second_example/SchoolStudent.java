package com.vivek.AdapterDesignPattern.second_example;

public class SchoolStudent {

    private String firstName;
    private String lastName;
    private String emailAddress;

    public SchoolStudent(String _firstName, String _lastName, String _emailAddress){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.emailAddress = _emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
