package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashMachineTest {

    @Test
    public void addTest() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(150);
        cashMachine.add(-100);
        cashMachine.add(300);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(3, transactions.length);
        assertEquals(300, transactions[2]);
    }

    @Test
    public void getBalanceTest(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(150);
        cashMachine.add(-100);
        cashMachine.add(300);

        assertEquals(350, cashMachine.getBalance());
    }
    @Test
    public void getNumberOfTransactionsTest(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(150);
        cashMachine.add(-100);
        cashMachine.add(300);

        assertEquals(3, cashMachine.getNumberOfTransactions());
    }
}