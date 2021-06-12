package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idclientes;
	
	@Column(name = "nombres", nullable = false, length = 30)
	String nombres;
	
	@Column(name = "apellidos", nullable = false, length = 30)
	String apellidos;
	
	@Column(name = "nit", nullable = false, length = 30)
	Integer nit;
	
	@Column(name = "telefono", nullable = true, length = 10)
	Integer telefono;
	
	@Column(name = "direccion", nullable = true, length = 10)
	String direccion;


	public Integer getIdclientes() {
		return idclientes;
	}

	public void setIdclientes(Integer idAlumno) {
		this.idclientes = idAlumno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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