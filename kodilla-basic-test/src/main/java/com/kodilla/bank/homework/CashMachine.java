package com.kodilla.bank.homework;

public class CashMachine {
    public int[] transactions;
    public int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int transaction) {
        this.size++;
        int[] newTransaction = new int[this.size];
        System.arraycopy(transactions, 0, newTransaction, 0, transactions.length);
        newTransaction[this.size - 1] = transaction;
        this.transactions = newTransaction;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getNumberOfTransactions() {
        return this.size;
    }

    public int getBalance() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public double getAverage() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum / this.transactions.length;
    }
}
