package com.kodilla.inheritance.homework;

public class Main {
    public static void main(String[] args) {
        SystemOne systemOne = new SystemOne(2005);
        systemOne.turnOn();

        SystemTwo systemTwo = new SystemTwo(2008);
        systemTwo.turnOff();
    }
}
