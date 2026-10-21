package com.karimcoding.workoutloggingapp.dao;

import com.karimcoding.workoutloggingapp.beans.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<AppUser,Integer> {

}