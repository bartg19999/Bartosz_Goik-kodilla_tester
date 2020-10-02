package com.kodilla.abstracts.homework2;

public abstract class Job {
    public static String responsibilities;
    public int salary;

    public Job(String responsibilities, int salary){
        this.responsibilities = responsibilities;
        this.salary = salary;
    }

    public String getResponsibilities(){
        return responsibilities;
    }
}
