package edu.uspg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uspg.dao.IclientesDAO;
import edu.uspg.model.clientes;
import edu.uspg.service.IclientesService;

@Service
public class clientesServiceImpl implements IclientesService {

	@Autowired
	private IclientesDAO dao;
	
	@Override
	public clientes registrar(clientes t) {
		return dao.save(t);
	}

	@Override
	public clientes modificar(clientes t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.deleteById(id);		
	}

	@Override
	public Optional<clientes> listarPorId(int id) {
		return dao.findById(id);
	}

	@Override
	public List<clientes> listar() {
		return dao.findAll();
	}

}