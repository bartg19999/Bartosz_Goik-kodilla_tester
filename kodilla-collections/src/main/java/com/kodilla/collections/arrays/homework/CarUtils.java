package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Suzuki;
import  com.kodilla.collections.interfaces.homework.Subaru;

public class CarUtils {

    public static void describeCar(Car car){
        System.out.println(getCarName(car));
        System.out.println(car.getSpeed());
    }
    private static String getCarName(Car car){
        if (car instanceof Toyota)
            return "Toyota";
        else if (car instanceof Subaru)
            return "Subaru";
        else if (car instanceof Suzuki)
            return "Suzuki";
        else
            return "Unknown car";
    }
}
