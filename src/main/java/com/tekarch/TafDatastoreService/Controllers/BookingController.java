package com.tekarch.TafDatastoreService.Controllers;

import com.tekarch.TafDatastoreService.Models.Booking;
import com.tekarch.TafDatastoreService.Service.BookingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datastore/bookings")
public class BookingController {

    @Autowired
    private BookingServiceImpl bookingService;

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
        Booking createdBooking = bookingService.createBooking(booking);
        return new ResponseEntity<>(createdBooking, HttpStatus.CREATED);
    }




}
