package com.tekarch.TafDatastoreService.Service;

import com.tekarch.TafDatastoreService.Models.Flight;

import java.util.List;

public interface FlightService {

    Flight addFlight(Flight flights);
    List<Flight> getAllFlights();
    Flight getFlightById(Long flightId);
    Flight updateFlight(Flight flight);
    void deleteFlight(Long flightId);
}
