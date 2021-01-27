package com.kodilla.collections.adv.exercises.homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    static Map<String, List<Flight>> flights = new HashMap<>();

    public void addFlight(String departure, String arrival){

    }
    public static Map<String, List<Flight>> getFlightsTable(){
        return flights;
    }

    public List<Flight> findFlightFrom(String arrival){
        return Collections.emptyList();
    }
    public List<Flight> findFlightTo(String departure){
        return Collections.emptyList();
    }
}
