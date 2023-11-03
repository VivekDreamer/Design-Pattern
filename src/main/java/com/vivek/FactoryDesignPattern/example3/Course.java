package com.vivek.FactoryDesignPattern.example3;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {
    protected List<Module> modules = new ArrayList<>();
    public Course(){
        this.createCourse();
    }
    public abstract void createCourse();
}
