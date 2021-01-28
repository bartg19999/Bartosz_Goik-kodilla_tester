package com.kodilla.exception.homework;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Warehouse {
    List<Order> orders = new ArrayList<>();

    public List<Order> addOrder(Order order){
        orders.add(new Order(new String()));
        return orders;
    }
    public Order getOrder(String number) {

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter order number: ");
            String s = scanner.nextLine();
            try{

            } catch (OrderDoesNotExistException e){
                System.out.println("");
            }
        }
    }
}
