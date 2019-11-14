package com.esprit.microservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esprit.microservice.models.Ward;


public interface WardRepository extends JpaRepository<Ward, Integer> {

}
