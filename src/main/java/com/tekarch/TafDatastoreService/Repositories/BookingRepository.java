package com.tekarch.TafDatastoreService.Repositories;

import com.tekarch.TafDatastoreService.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findAllByUserId(Long userId);
}
