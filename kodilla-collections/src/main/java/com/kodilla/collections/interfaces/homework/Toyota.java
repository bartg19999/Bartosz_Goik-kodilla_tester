package com.kodilla.collections.interfaces.homework;

public class Toyota implements Car {

    private int speed;

    public Toyota(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = speed + 30;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = speed - 20;
    }

    @Override
    public void describeCar() {
        describeCar();
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "speed=" + speed +
                '}';
    }
}
