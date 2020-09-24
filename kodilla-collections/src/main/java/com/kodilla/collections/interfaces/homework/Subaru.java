package com.kodilla.collections.interfaces.homework;

public class Subaru implements Car {

    private int speed;

    public Subaru(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = speed + 20;
        }

    @Override
    public void decreaseSpeed() {
        this.speed = speed - 10;
        }
    }