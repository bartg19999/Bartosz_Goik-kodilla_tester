package com.kodilla.bank.homework;

public class Bank {
    private CashMachine rynek;
    private CashMachine plaza;
    private CashMachine focus;

    public Bank(){
        this.rynek = new CashMachine();
        this.plaza = new CashMachine();
        this.focus = new CashMachine();
    }
    public void addRynekTransaction(int transaction){
        this.rynek.add(transaction);
    }
    public void addPlazaTransaction(int transaction){
        this.plaza.add(transaction);
    }
    public void addFocusTransaction(int transaction){
        this.focus.add(transaction);
    }

    public double getRynekAverageDeposit(int transaction) {
        if (transaction < 0) {
            return this.rynek.getAverage();
        }
        return this.rynek.getAverage();
    }
    public double getPlazaAverage(int transaction){
        return this.plaza.getAverage();
    }
    public double getFocusAverage(){
        return this.focus.getAverage();
    }
    public void payments(){
        for (int i = 0; i < 0; i++){
            System.out.println(i);
        }
    }
    public void deposits(){
        for (int i1 = 0; i1 > 0; i1++){
            System.out.println(i1);
        }
    }
}

