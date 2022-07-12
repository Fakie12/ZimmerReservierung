package com.projekt1.zimmerreservierung.repos;

import com.projekt1.zimmerreservierung.models.BedRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedRoomRepository extends JpaRepository<BedRoom, Long> {
}
