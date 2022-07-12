package com.projekt1.zimmerreservierung.repos;

import com.projekt1.zimmerreservierung.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
