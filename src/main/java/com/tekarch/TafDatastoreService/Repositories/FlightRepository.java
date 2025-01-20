package com.tekarch.TafDatastoreService.Repositories;

import com.tekarch.TafDatastoreService.Models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}
