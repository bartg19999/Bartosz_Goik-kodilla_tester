package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom(String departure, String arrival){
        //given
        FlightFinder flight = new FlightFinder();
        //when
        List<Flight> result = flight.findFlightsFrom(departure);
        //then
        assertEquals();
    }
    @Test
    public void testFindFlightsTo(String departure, String arrival){

    }

}