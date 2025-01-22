package com.tekarch.TafDatastoreService.Service;

import com.tekarch.TafDatastoreService.Models.Booking;
import com.tekarch.TafDatastoreService.Repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private BookingRepository bookingRepository;


    @Override
    public Booking createBooking(Booking bookings) {
        bookings.setStatus("Booked");
        bookings.setCreatedAt(LocalDateTime.now());
        bookings.setUpdatedAt(LocalDateTime.now());
        return bookingRepository.save(bookings);
    }

    @Override
    public List<Booking> getBookingsByUserId(Long userId) {
        return bookingRepository.findAllByUserId(userId);
    }

    @Override
    public Booking getBookingById(Long bookingId) {
        return bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found with ID: " + bookingId));
    }
}
