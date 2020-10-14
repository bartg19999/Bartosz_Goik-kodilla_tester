package com.kodilla.stream.homework;

import java.time.LocalDate;

public class TaskManager {
    public static void main(String[] args) {
        TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getDeadline().isAfter(LocalDate.now()))
                .map(Task::getName)
                .forEach(tn -> System.out.println(tn));
    }
}
