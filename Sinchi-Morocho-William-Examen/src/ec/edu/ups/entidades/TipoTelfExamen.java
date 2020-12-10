package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TipoTelfExamen
 *
 */
@Entity

public class TipoTelfExamen implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipo;
	
	private String tipoTelefono;
	
	@OneToOne(mappedBy = "tipTelefonotlf")
	private TelefonosExamen telefonoTipo;

	public TipoTelfExamen() {
		super();
	}

	public TipoTelfExamen(String tipoTelefono) {
		super();
		this.tipoTelefono = tipoTelefono;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getTipoTelefono() {
		return tipoTelefono;
	}

	public void setTipoTelefono(String tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}

	public TelefonosExamen getTelefonoTipo() {
		return telefonoTipo;
	}

	public void setTelefonoTipo(TelefonosExamen telefonoTipo) {
		this.telefonoTipo = telefonoTipo;
	}

	@Override
	public int hashCode() {
		
		return this.idTipo;
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
