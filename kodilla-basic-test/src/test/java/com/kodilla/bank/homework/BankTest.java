package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTest {
    @Test
    public void addRynekTransactionTest(){
        Bank cashMachine = new Bank();

        cashMachine.addRynekTransaction(140);
        cashMachine.addRynekTransaction(200);
        cashMachine.addRynekTransaction(-100);

        int[] transactions =
        assertEquals(3, tra);
    }
}