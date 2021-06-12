package edu.uspg.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import edu.uspg.exception.ModeloNotFoundException;
import edu.uspg.model.ordenes;
import edu.uspg.service.IordenesService;

@RestController
@RequestMapping("/ordenes")
public class ordenesController {

	@Autowired
	private IordenesService service;
	
	/*LIST ALL*/
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ordenes>> listar(){
		return new ResponseEntity<List<ordenes>>(service.listar(), HttpStatus.OK);
	}
	
	/*LIST FOR ID*/
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ordenes> listarPodId(@PathVariable("id") Integer id){
	
		Optional<ordenes> ordenes = service.listarPorId(id);
		if(!ordenes.isPresent()) {
			throw new ModeloNotFoundException("id no encontrado:" + id);
		}
		return new ResponseEntity<ordenes>(ordenes.get(),HttpStatus.OK);
	}
	
	/*REGISTER*/
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> registrar(@RequestBody ordenes orden) {
		ordenes ordenes = new ordenes();
		ordenes = service.registrar(orden);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(ordenes.getIdordenes()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	/*UPDATE*/
	@PutMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> modificar(@RequestBody ordenes orden){
		service.modificar(orden);
		return new ResponseEntity<Object>(HttpStatus.OK);
	}
	
	/*DELETE*/
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		Optional<ordenes> ordenes = service.listarPorId(id);
		if(!ordenes.isPresent()) {
			throw new ModeloNotFoundException("id no encontrado: " + id);
		} else {
			service.eliminar(id);
		}
	}
}