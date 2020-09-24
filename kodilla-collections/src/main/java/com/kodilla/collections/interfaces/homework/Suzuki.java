package com.kodilla.collections.interfaces.homework;

public class Suzuki implements Car {

    private int speed;

    public Suzuki (int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = speed + 25;
    }

    @Override
    public void decreaseSpeed () {
        this.speed = speed - 15;
    }
}
