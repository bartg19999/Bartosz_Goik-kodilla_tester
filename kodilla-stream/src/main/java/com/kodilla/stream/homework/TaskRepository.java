package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Go to the doctor", LocalDate.of(2020, 9, 22) ,LocalDate.of(2020, 10, 30)));
        tasks.add(new Task("Painting", LocalDate.of(2020, 9, 28), LocalDate.of(2020, 10, 1)));
        tasks.add(new Task("Planning", LocalDate.of(2020, 10, 28), LocalDate.of(2020, 12, 12)));
        return tasks;
    }
}
