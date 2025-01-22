package com.tekarch.TafDatastoreService.Controllers;

import com.tekarch.TafDatastoreService.Models.Flight;
import com.tekarch.TafDatastoreService.Service.FlightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/datastore/flights")
public class FlightController {


    @Autowired
    private FlightServiceImpl flightService;


    @PostMapping()
    public ResponseEntity<Flight> addFlight(@RequestBody Flight flight) {
        Flight addedFlight = flightService.addFlight(flight);
        return ResponseEntity.ok(addedFlight);
    }

    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights(){
        List<Flight> flights = flightService.getAllFlights();
        return ResponseEntity.ok(flights);
    }

    @GetMapping("/{flightId}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Long flightId) {
        Flight flight = flightService.getFlightById(flightId);
        return flight != null ? ResponseEntity.ok(flight) : ResponseEntity.notFound().build();

    }



}
