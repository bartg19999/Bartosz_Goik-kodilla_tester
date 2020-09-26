package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

import static com.kodilla.collections.arrays.homework.CarsApplication.drawCar;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)];
        for (int c = 0; c < cars.length; c++)
            cars[c] = drawCar();
    }
}
