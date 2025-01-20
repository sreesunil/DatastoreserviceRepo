package com.tekarch.TafDatastoreService.Repositories;

import com.tekarch.TafDatastoreService.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
