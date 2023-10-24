package com.vivek.AdapterDesignPattern.second_example;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student> getStudentList(){
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("a", "b", "c");
        SchoolStudent schoolStudent = new SchoolStudent("x", "y", "z");
        students.add(collegeStudent);
        // students.add(schoolStudent); //giving compile time error as SchoolStudent class is not implementing the Student interface.
        students.add(new SchoolStudentAdapter(schoolStudent));
        return students;
    }
}
