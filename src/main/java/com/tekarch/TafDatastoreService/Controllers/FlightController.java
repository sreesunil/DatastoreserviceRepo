package com.tekarch.TafDatastoreService.Controllers;

import com.tekarch.TafDatastoreService.Models.Flight;
import com.tekarch.TafDatastoreService.Service.FlightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
