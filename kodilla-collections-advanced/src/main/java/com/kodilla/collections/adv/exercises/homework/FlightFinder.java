package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public static List<Flight> findFlightsFrom(String searchedDeparture){
        List<Flight> departures = new ArrayList<>();
        for (Flight departure : FlightRepository.getFlightsTable()){
            if(departure.equals(searchedDeparture)){
                System.out.println("This flight exists");;
            }else {
                System.out.println("Flight not found.");
            }
        }
        return departures;
    }
    public static List<Flight> findFlightsTo(String searchedArrival){
        List<Flight> arrivals = new ArrayList<>();
        for (Flight arrival : FlightRepository.getFlightsTable()){
            if (arrival.equals(searchedArrival)){
                System.out.println("This flight exists");;
            }else{
                System.out.println("Flight not found");
            }
        }
        return arrivals;
    }
}
