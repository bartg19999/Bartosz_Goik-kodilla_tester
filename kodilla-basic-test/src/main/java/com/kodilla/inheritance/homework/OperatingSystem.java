package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }
    public void turnOn(){
        System.out.println(this.year + " - system turned on.");
    }
    public void turnOff(){
        System.out.println(this.year + " - system turned off.");
    }
}
