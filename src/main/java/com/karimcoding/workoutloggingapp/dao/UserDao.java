package com.karimcoding.workoutloggingapp.dao;

import com.karimcoding.workoutloggingapp.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<AppUser,Integer> {
    Optional<AppUser> findByEmail(String email);

    boolean existsByEmail (String email);
}