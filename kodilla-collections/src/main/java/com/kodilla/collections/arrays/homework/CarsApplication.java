package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Subaru;
import com.kodilla.collections.interfaces.homework.Suzuki;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.Random;

public class CarsApplication {
    private static int speed;
    public CarsApplication(int speed){
        this.speed = speed;
    }
    public static Car drawCar() {
        Random random = new Random();
        int drawNewCar = random.nextInt(3);
        int speed = random.nextInt(300);
        if (drawNewCar == 0)
            return new Toyota(speed);
        else if (drawNewCar == 1)
            return new Subaru(speed);
        else
            return new Suzuki(speed);
    }
}
