package com.kodilla.abstracts.homework2;

public class Main {
    public static void main(String[] args) {
        Plumber plumber = new Plumber();
        Main processor = new Main();
        processor.process(plumber);

    }


    private void process(Job job) {
        System.out.println("Plumber has to " + Plumber.getResponsibilities());
    }
}
