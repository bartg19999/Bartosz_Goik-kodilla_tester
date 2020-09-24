package com.kodilla.collections.interfaces.homework;

public class Race {
    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed equals " + car.getSpeed());
    }
}
