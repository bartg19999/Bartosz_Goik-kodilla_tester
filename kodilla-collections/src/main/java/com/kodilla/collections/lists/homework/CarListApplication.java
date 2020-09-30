package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Subaru;
import com.kodilla.collections.interfaces.homework.Suzuki;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Subaru(160));
        cars.add(new Suzuki(140));
        Toyota toyota = new Toyota(200);

        cars.remove(1);
        cars.remove(toyota);

        System.out.println(cars.size());
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
}
