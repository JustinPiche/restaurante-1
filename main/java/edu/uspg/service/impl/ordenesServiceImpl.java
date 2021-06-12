package edu.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.dao.IordenesDAO;
import edu.uspg.model.ordenes;
import edu.uspg.service.IordenesService;

@Service
public class ordenesServiceImpl implements IordenesService {

	@Autowired
	private IordenesDAO dao;
	
	@Override
	public ordenes registrar(ordenes t) {
		return dao.save(t);
	}

	@Override
	public ordenes modificar(ordenes t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<ordenes> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<ordenes> listar() {
		return dao.findAll();
	}

}