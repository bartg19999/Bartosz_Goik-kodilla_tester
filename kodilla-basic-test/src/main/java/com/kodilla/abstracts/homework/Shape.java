package com.kodilla.abstracts.homework;

public abstract class Shape {
    public int a;
    public int b;

    public Shape(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void getSquareSurfaceArea(){
        System.out.println(a * b);
    }
    public int getSquareCircuit(){
        return a + a + b + b;
    }

}
