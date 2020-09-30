package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamps> stamps = new HashSet<>();
        stamps.add(new Stamps("Horse", "4.15 x 5.12", "Stampled"));
        stamps.add(new Stamps("Duck", "4.10 x 5.10", "Not stampled"));
        stamps.add(new Stamps("Dog", "4.15 x 5.20", "Stampled"));
        stamps.add(new Stamps("Duck", "4.10 x 5.10", "Not stampled"));

        System.out.println(stamps.size());
        for (Stamps stamp : stamps)
            System.out.println(stamp);

    }
}
