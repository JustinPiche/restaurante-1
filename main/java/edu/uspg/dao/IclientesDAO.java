package edu.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.clientes;

public interface IclientesDAO extends JpaRepository<clientes, Integer> {

}