package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int a;
    private int b;
    private int h;

    public Shape(int a, int b, int h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public int getSquareSurfaceArea(){
        return a * b;
    }
    public int getSquareCircuit(){
        return a + a + b + b;
    }

}
