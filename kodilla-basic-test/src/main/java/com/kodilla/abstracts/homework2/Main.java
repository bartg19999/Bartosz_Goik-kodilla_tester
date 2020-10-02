package com.kodilla.abstracts.homework2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Maciek", new Plumber(), 30);
        JobProcessor processor = new JobProcessor();
        processor.process(person.job);
    }
}
