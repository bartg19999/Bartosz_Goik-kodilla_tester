package com.kodilla.abstracts.homework2;

public abstract class Job {
    public static String responsibilities;
    public int salary;

    public Job(String responsibilities, int salary){
    }

    public static String getResponsibilities(){
        return responsibilities;
    }
}
