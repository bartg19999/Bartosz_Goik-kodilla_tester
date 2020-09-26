package com.kodilla.abstracts.homework2;

public class Person {

    public String firstName;
    public Job job;
    public int age;
    public Person(String firstName, Job job, int age){
        Plumber plumber = new Plumber();
        Firefighter firefighter = new Firefighter();
        Policeman policeman = new Policeman();
        Person person = new Person("Maciek", plumber, 26 );
        Person person1 = new Person("Krzysztof", firefighter, 26);
        Person person2 = new Person("Tomasz", policeman, 38);
    }

}
