package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

public class CarsApplication {
    private static int speed;
    public CarsApplication(int speed){
        this.speed = speed;
    }
    public static Car drawCar() {
        Random random = new Random();
        int drawNewCar = random.nextInt(1);
        int speed = random.nextInt(300);
        System.out.println(speed + " km/h");
        return null;
    }
}
