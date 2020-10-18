package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Tomasz", new Teacher("Abelard")));
        students.add(new Student("Maciej", new Teacher(null)));

        for (Student student : students) {
            System.out.println("Student: " + student.getName() + "  Teacher: " + student.getTeacher());
        }

        List<Student> studentList = null;
        Optional<List<Student>> optionalTeacher = Optional.ofNullable(students);

        studentList = optionalTeacher.orElse(students.add(new Student("Marcin", null)).getTeacher;
        System.out.println("<undefined>");
    }
}
