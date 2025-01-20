package com.tekarch.TafDatastoreService.Service;

import com.tekarch.TafDatastoreService.Models.Flight;
import com.tekarch.TafDatastoreService.Repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;


    @Override
    public Flight addFlight(Flight flights) {
        return flightRepository.save(flights);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public Flight getFlightById(Long flightId) {
        return flightRepository.findById(flightId).orElse(null);
    }


    @Override
    public Flight updateFlight(Flight flight) {
        return flightRepository.save(flight);  // Save the updated flight object
    }


    @Override
    public void deleteFlight(Long flightId) {
        flightRepository.deleteById(flightId);
    }
}
