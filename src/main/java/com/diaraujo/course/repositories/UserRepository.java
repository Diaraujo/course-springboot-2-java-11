package com.diaraujo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diaraujo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
