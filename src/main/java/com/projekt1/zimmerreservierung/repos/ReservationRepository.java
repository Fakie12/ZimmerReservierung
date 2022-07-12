package com.projekt1.zimmerreservierung.repos;

import com.projekt1.zimmerreservierung.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
