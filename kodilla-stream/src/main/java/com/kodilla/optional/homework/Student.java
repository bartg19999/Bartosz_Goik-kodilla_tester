package com.kodilla.optional.homework;

import java.util.List;
import java.util.ArrayList;

public class Student {
    String name;
    Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return name + teacher;
    }
}
