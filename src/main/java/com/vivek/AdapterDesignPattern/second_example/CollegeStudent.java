package com.vivek.AdapterDesignPattern.second_example;

public class CollegeStudent implements Student{

    private String name;
    private String surname;
    private String email;

    public CollegeStudent(String _name, String _surname, String _email){
        this.name = _name;
        this.surname = _surname;
        this.email = _email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }
    
}
