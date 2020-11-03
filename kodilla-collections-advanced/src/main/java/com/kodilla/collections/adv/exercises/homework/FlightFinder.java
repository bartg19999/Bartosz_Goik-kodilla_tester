package com.kodilla.collections.adv.exercises.homework;


import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    Map<String, String> flights = new HashMap<>();

    public List<Flight> findFlightsFrom(String departure, String arrival){
        return flights.getOrDefault(List<Flight>, departure);
    }
    public List<Flight> findFlightsTo(String arrival){
        return Collections.emptyList();
    }
}
