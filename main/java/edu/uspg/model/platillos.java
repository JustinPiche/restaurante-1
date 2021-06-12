package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "platillos")
public class platillos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idplatillos;
	
	@Column(name = "tipoplatillos", nullable = false, length = 30)
	String tipoplatillos;
	
	@Column(name = "nombre", nullable = false, length = 30)
	String nombre;


	public Integer getIdplatillos() {
		return idplatillos;
	}

	public void setIdplatillos(Integer idplatillos) {
		this.idplatillos = idplatillos;
	}

	public String gettipoplatillos() {
		return tipoplatillos;
	}

	public void settipoplatillos(String tipoplatillos) {
		this.tipoplatillos = tipoplatillos;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	
}

	