package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.arrays.ShapeUtils;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.homework.Car;

import java.util.Random;

import static com.kodilla.collections.arrays.homework.CarsApplication.drawCar;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
}
