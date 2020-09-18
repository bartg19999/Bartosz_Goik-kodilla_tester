package com.kodilla.inheritance;

public class OperatingSystem {
    private int year;
    public void SystemTwo(int year){
        this.year = year;
    }
    public void turnOn(){
        System.out.println("System turned on");
    }
    public void turnOff(){
        System.out.println("System turned off");
    }
}

