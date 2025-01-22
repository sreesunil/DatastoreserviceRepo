package com.tekarch.TafDatastoreService.Service;

import com.tekarch.TafDatastoreService.Models.Booking;

import java.util.List;

public interface BookingService {


    Booking createBooking(Booking bookings);
    List<Booking> getBookingsByUserId(Long userId);
    Booking getBookingById(Long bookingId);
}
