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
	
	@ManyToOne
	@JoinColumn
	private UsuarioExamen usuarioTelExamen;
	
	@OneToOne(mappedBy = "telefonoOperadora")
	private OperadoraExamen operadora;
	
	@OneToOne(mappedBy = "telefonoTipo")
	private TipoTelfExamen tipoTelefono;
	
	public TelefonosExamen() {
		super();
	}

	public TelefonosExamen(String numeroTelefono) {
		super();
		this.numeroTelefono = numeroTelefono;
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

	public UsuarioExamen getUsuarioTelExamen() {
		return usuarioTelExamen;
	}

	public void setUsuarioTelExamen(UsuarioExamen usuarioTelExamen) {
		this.usuarioTelExamen = usuarioTelExamen;
	}

	public OperadoraExamen getOperadora() {
		return operadora;
	}

	public void setOperadora(OperadoraExamen operadora) {
		this.operadora = operadora;
	}

	public TipoTelfExamen getTipoTelefono() {
		return tipoTelefono;
	}

	public void setTipoTelefono(TipoTelfExamen tipoTelefono) {
		this.tipoTelefono = tipoTelefono;
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
		return obj.hashCode() == this.hashCode();
	}
	
	
	
	
	
	
   
}
