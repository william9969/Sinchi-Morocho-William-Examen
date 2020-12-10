package ec.edu.ups.entidades;

import java.io.Serializable;


import javax.persistence.*;

/**
 * Entity implementation class for Entity: OperadoraExamen
 *
 */
@Entity

public class OperadoraExamen implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int idOperadora;
	
	private String nomOperadora;
	
	@OneToOne(mappedBy = "operadoraTelefono")
	private TelefonosExamen telefonoOperadora;
	

	public OperadoraExamen() {
		super();
	}


	public OperadoraExamen(String nomOperadora) {
		super();
		this.nomOperadora = nomOperadora;
	}


	public int getIdOperadora() {
		return idOperadora;
	}


	public void setIdOperadora(int idOperadora) {
		this.idOperadora = idOperadora;
	}


	public String getNomOperadora() {
		return nomOperadora;
	}


	public void setNomOperadora(String nomOperadora) {
		this.nomOperadora = nomOperadora;
	}


	public TelefonosExamen getTelefonoOperadora() {
		return telefonoOperadora;
	}


	public void setTelefonoOperadora(TelefonosExamen telefonoOperadora) {
		this.telefonoOperadora = telefonoOperadora;
	}


	@Override
	public int hashCode() {
		
		return this.idOperadora;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return obj.hashCode() == this.hashCode();
	}
   
	
	
	
}
