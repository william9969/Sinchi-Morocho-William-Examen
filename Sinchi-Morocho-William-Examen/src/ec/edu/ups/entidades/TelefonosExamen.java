package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TelefonosExamen
 *
 */
@Entity

public class TelefonosExamen implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTelefonos;
	
	private String numeroTelefono;
	private String tipoTelefono;
	private String operadorTelefono;
	
	@ManyToOne
	@JoinColumn
	private UsuarioExamen usuarioTelExamen;
	
	
	
	public TelefonosExamen() {
		super();
	}
	

	public TelefonosExamen(String numeroTelefono, String tipoTelefono, String operadorTelefono) {
		super();
		this.numeroTelefono = numeroTelefono;
		this.tipoTelefono = tipoTelefono;
		this.operadorTelefono = operadorTelefono;
	}


	public int getIdTelefonos() {
		return idTelefonos;
	}



	public void setIdTelefonos(int idTelefonos) {
		this.idTelefonos = idTelefonos;
	}



	public String getNumeroTelefono() {
		return numeroTelefono;
	}



	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}



	public String getTipoTelefono() {
		return tipoTelefono;
	}



	public void setTipoTelefono(String tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
	}



	public String getOperadorTelefono() {
		return operadorTelefono;
	}



	public void setOperadorTelefono(String operadorTelefono) {
		this.operadorTelefono = operadorTelefono;
	}



	public UsuarioExamen getUsuarioTelExamen() {
		return usuarioTelExamen;
	}



	public void setUsuarioTelExamen(UsuarioExamen usuarioTelExamen) {
		this.usuarioTelExamen = usuarioTelExamen;
	}



	@Override
	public int hashCode() {
		return this.idTelefonos;
	}



	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		return this.hashCode()==obj.hashCode();
	}
	
	
	
	
   
}
