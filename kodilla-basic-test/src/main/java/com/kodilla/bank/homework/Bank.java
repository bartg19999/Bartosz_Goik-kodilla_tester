package com.kodilla.bank.homework;

public class Bank {
    public CashMachine[] cashmachines;

    public Bank(CashMachine cashMachine){
        this.cashmachines = new CashMachine[0];
    }

    public CashMachine[] getCashmachines() {
        return cashmachines;
    }

    public int allCashMachinesBalance(CashMachine cashMachine){
        int sum = 0;
        for (int i = 0; i < cashmachines.length; i++){
            sum += getCashmachines().length
        }
        return
    }

    public void payments(){
        int sum = 0;
        for (int i = 0; i < 0; i++){
            sum += this.cashmachines[i];
        }
    }
    public void deposits(){
        for (int i1 = 0; i1 > 0; i1++){
            System.out.println(i1);
        }
    }
}

