package com.projekt1.zimmerreservierung.repos;


import com.projekt1.zimmerreservierung.models.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {
}
