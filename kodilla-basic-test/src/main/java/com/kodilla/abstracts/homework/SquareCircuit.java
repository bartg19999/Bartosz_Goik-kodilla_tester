package com.kodilla.abstracts.homework;

public class SquareCircuit extends Shape {
    public SquareCircuit(){
        super(8, 4);
    }

    @Override
    public int getSquareCircuit() {
        return a + a + b + b;
    }
}
