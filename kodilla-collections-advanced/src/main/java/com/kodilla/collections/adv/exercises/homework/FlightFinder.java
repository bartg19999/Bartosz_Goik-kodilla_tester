package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(String searchedDeparture){
        List<Flight> departures = new ArrayList<>();
        for (Flight departure : FlightRepository.getFlightsTable()){
            if(FlightRepository.getFlightsTable().equals(searchedDeparture)){
                departures.add(new Flight(Flight.departure, Flight.arrival));
            }else {
                System.out.println("Flight not found.");
            }
        }
        return departures;
    }
    public static List<Flight> findFlightsTo(String searchedArrival){
        List<Flight> arrivals = new ArrayList<>();
        for (Flight arrival : FlightRepository.getFlightsTable()){
            if (FlightRepository.getFlightsTable().equals(searchedArrival)){
                arrivals.add(new Flight(Flight.departure, Flight.arrival));
            }else{
                System.out.println("Flight not found");
            }
        }
        return arrivals;
    }
}
