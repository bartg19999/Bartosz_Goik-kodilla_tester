package com.kodilla.collections.interfaces.homework;

import static com.kodilla.collections.interfaces.homework.Car.*;
import static com.kodilla.collections.interfaces.homework.Race.doRace;

public class CarRace {
    public static void main(String[] args) {
        Toyota toyota = new Toyota(80);
        doRace(toyota);
        Subaru subaru = new Subaru(70);
        doRace(subaru);
        Suzuki suzuki = new Suzuki(100);
        doRace(suzuki);
    }
}