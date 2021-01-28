package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom(){
        //given
        FlightRepository flightRepository = new FlightRepository();
        Flight flight = new Flight("Warsaw", "London");
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> expectedDepartures = new ArrayList<>();
        expectedDepartures.add(new Flight("Warsaw", "Helsinki"));
        assertEquals("Warsaw", Flight.getDeparture());
    }
    @Test
    public void testFindFlightsTo(){
        //when
        FlightRepository flightRepository = new FlightRepository();
        Flight flight = new Flight("Warsaw", "Helsinki");
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Helsinki");
        //then
        List<Flight> expectedArrivals = new ArrayList<>();
        expectedArrivals.add(new Flight("Warsaw", "Helsinki"));
        assertEquals("Helsinki", Flight.getArrival());

    }
}