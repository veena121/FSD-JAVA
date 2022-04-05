package com.nmscinemas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nmscinemas.entities.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Integer>{

}
