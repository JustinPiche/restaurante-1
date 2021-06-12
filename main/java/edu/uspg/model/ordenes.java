package edu.uspg.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ordenes")
public class ordenes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idordenes;
	
	@Column(name = "tipoorden", nullable = false, length = 30)
	String tipoorden;
	
	@Column(name = "nombre", nullable = false, length = 30)
	String nombre;
	
	@Column(name = "nit", nullable = false, length = 30)
	Integer nit;
	
	@Column(name = "telefono", nullable = true, length = 10)
	Integer telefono;
	
	@Column(name = "direccion", nullable = true, length = 10)
	String direccion;


	public Integer getIdordenes() {
		return idordenes;
	}

	public void setIdordenes(Integer idordenes) {
		this.idordenes = idordenes;
	}

	public String gettipoorden() {
		return tipoorden;
	}

	public void settiporoden(String tipoorden) {
		this.tipoorden = tipoorden;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getnit() {
		return nit;
	}

	public void setnit(Integer nit) {
		this.nit = nit;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getdireccion () {
		return direccion;
	}

	public void setdireccion(String direccion) {
		this.direccion = direccion;
	}

}