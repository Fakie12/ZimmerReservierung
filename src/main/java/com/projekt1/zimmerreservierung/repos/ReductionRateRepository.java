package com.projekt1.zimmerreservierung.repos;

import com.projekt1.zimmerreservierung.models.ReductionRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReductionRateRepository extends JpaRepository<ReductionRate, Long> {
}
