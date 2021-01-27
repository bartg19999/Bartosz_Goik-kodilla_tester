package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom(String departure){
        //given
        FlightRepository
        //when
        List<Flight> result = FlightFinder.findFlightsFrom("Warsaw");
        //then
        List<Flight> expectedDepartures = new ArrayList<>();
        expectedDepartures.add(new Flight("Warsaw", "Helsinki"));
        expectedDepartures.add(new Flight("Warsaw", "London"));
        assertEquals(2, result.size());
    }
    @Test
    public void testFindFlightsTo(String arrival){
        //when
        List<Flight> result = FlightFinder.findFlightsTo("Helsinki");
        //then
        List<Flight> expectedArrivals = new ArrayList<>();
        expectedArrivals.add(new Flight("Warsaw", "Helsinki"));
        assertEquals(1, result.size());

    }
}