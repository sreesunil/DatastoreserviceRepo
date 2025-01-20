package com.tekarch.TafDatastoreService.Repositories;

import com.tekarch.TafDatastoreService.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
