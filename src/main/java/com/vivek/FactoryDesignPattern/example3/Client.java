package com.vivek.FactoryDesignPattern.example3;

public class Client {
    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("HLD");
        Course lldCourse = CourseFactory.getCourse("LLD");
        assert hldCourse != null;
        System.out.println("HLD modules: ");
        System.out.println(hldCourse.modules);
        System.out.println("LLD modules: ");
        System.out.println(lldCourse.modules);
    }
}
