package com.vivek.AdapterDesignPattern.second_example;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        StudentClient studentClient = new StudentClient();
        List<Student> studentList = studentClient.getStudentList();
        System.out.println(studentList);
    }
}
