package com.kodilla.abstracts.homework2;

public class Person {
    public String firstName;
    public Job job;
    public int age;

    public Person(String firstName, Job job, int age){
        this.firstName=firstName;
        this.job=job;
        this.age=age;
    }
    public void process(Job job) {
        System.out.println(job + " has to " + Plumber.getResponsibilities());

    }
}
