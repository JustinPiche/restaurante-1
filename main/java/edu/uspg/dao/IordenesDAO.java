package edu.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.ordenes;

public interface IordenesDAO extends JpaRepository<ordenes, Integer> {

}