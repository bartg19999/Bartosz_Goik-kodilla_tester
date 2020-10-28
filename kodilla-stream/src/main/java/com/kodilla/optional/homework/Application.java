package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Tomasz Jagie³³o", new Teacher("Abelard Konieczny")));
        students.add(new Student("Maciej Szybki", null));
        students.add(new Student("Andrzej Ma³y", new Teacher("Mateusz Nowak")));

        for (Student student : students) {
            System.out.println("Student: " + student.getName() + " Teacher: " + student.getTeacher());
        }

        Teacher teacher = null;
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);

        Teacher name =
                optionalTeacher.orElse();

        System.out.println(name + "<undefined>");

    }
}
