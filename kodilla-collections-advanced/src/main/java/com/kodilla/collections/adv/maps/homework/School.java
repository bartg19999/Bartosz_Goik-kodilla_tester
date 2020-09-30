package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class School {
    private List<Double> classroom = new ArrayList<>();
    private int schoolNumber;

    public School(int schoolNumber, double ... classroom){
        for (double student : classroom)
            this.classroom.add(student);
        this.schoolNumber = schoolNumber;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public List<Double> getStudents() {
        double sum = 0.0;
        for (double student : classroom)
            sum += student;
        return Collections.singletonList(sum);
    }

    @Override
    public String toString() {
        return "Students - " + classroom;
    }
}
