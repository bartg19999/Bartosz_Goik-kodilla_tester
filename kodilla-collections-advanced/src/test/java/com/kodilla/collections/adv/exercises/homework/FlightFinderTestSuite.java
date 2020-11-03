package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom(String departure){
        //given
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.addFlight("Helsinki", "Chicago");;
        //when
        List<Flight> result = flightFinder.findFlightsFrom(departure);
        //then
        assertEquals("Helsinki", result.toString());
    }
    @Test
    public void testFindFlightsTo(String arrival){
        FlightRepository flightRepository = new FlightRepository();
        FlightRepository.getFlightsTable();
        //when
        List<Flight> result =

    }
}