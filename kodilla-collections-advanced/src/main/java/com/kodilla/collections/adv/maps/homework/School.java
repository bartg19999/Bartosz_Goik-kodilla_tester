package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> students = new ArrayList<>();
    private int schoolNumber;

    public School(int schoolNumber, double ... students){
        for (double student : students)
            this.students.add(student);
        this.schoolNumber = schoolNumber;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public List<Double> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Students - " + students;
    }
}
