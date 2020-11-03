package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlightRepository {
    public static void getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        Flight flight = new Flight("Warsaw", "Helsinki");
        flights.add(flight);
        Flight flight1 = new Flight("Warsaw", "London");
        flights.add(flight1);
        Flight flight2 = new Flight("Rome", "Warsaw");
        flights.add(flight2);


    }
}
