package edu.uspg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mesas")
public class mesas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idmesas;
	
	@Column(name = "tipomesa", nullable = false, length = 30)
	String tipomesa;
	
	@Column(name = "numerosillas", nullable = false, length = 30)
	Integer numerosillas;
	

	public Integer getIdmesas() {
		return idmesas;
	}

	public void setIdmesas(Integer idmesas) {
		this.idmesas = idmesas;
	}

	public String gettipomesa() {
		return tipomesa;
	}

	public void settipomesa(String tipomesa) {
		this.tipomesa = tipomesa;
	}

	public Integer getnumerosillas() {
		return numerosillas;
	}

	public void setnumerosillas(Integer numerosillas) {
		this.numerosillas = numerosillas;
	}

	

	
}