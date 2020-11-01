package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Tomasz Jagiello", new Teacher("Abelard Konieczny")));
        students.add(new Student("Maciej Szybki", null));
        students.add(new Student("Andrzej Maly", new Teacher("Mateusz Nowak")));

        for (Student student : students) {
            Optional<Student> optionalStudent = Optional.ofNullable(student);

            String message = String.format("Uczen: %s  Nt sauczyciel: %s", optionalStudent.map(Student::getName).orElse("<undefined>"),
                    optionalStudent.map(Student::getTeacher).map(Teacher::getName).orElse("<undefined>"));
            System.out.println(message);
        }


    }
}
