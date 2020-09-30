package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();
        Principal walczak = new Principal("Maciej", "Walczak");
        Principal nowak = new Principal("Tomasz", "Nowak");
        Principal malek = new Principal("Andrzej", "Małek");

        School walczakSchool = new School(7, 423.0);
        School nowakSchool = new School(18, 389.0);
        School malekSchool = new School(22, 548.0);

        schools.put(walczak, walczakSchool);
        schools.put(nowak, nowakSchool);
        schools.put(malek, malekSchool);

        for(Map.Entry<Principal, School> principalEntry : schools.entrySet()) {
            System.out.println(principalEntry.getKey());
            System.out.println("School nr: " + principalEntry.getValue().getSchoolNumber());
            System.out.println(principalEntry.getValue());
        }
    }
}
