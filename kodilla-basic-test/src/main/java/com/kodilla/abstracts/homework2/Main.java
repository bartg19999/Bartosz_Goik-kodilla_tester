package com.kodilla.abstracts.homework2;

public class Main {
    public static void main(String[] args) {
        Main processor = new Main();
        processor.process("Plumber");
    }

    private void process(String Plumber) {
        Plumber plumber = new Plumber();
        System.out.println("Plumber has to " + Job.getResponsibilities());
    }
}
