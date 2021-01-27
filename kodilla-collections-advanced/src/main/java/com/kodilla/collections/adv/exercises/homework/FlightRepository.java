package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public void addFlight(String departure, String arrival){

    }
    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Warsaw", "Tokyo"));
        flights.add(new Flight("Toronto", "Warsaw"));

        return flights;
    }

    public List<Flight> findFlightFrom(String arrival){
        return Collections.emptyList();
    }
    public List<Flight> findFlightTo(String departure){
        return Collections.emptyList();
    }
}
