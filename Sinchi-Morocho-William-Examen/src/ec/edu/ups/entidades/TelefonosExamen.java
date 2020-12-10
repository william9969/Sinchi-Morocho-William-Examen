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
	
	@OneToOne
	@JoinColumn
	private OperadoraExamen operadoraTelefono;
	
	@OneToOne
	@JoinColumn
	private TipoTelfExamen tipTelefonotlf;
	
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

	public OperadoraExamen getOperadoraTelefono() {
		return operadoraTelefono;
	}

	public void setOperadoraTelefono(OperadoraExamen operadoraTelefono) {
		this.operadoraTelefono = operadoraTelefono;
	}

	public TipoTelfExamen getTipoTelefonotlf() {
		return tipTelefonotlf;
	}

	public void setTipoTelefonotlf(TipoTelfExamen tipoTelefonotlf) {
		this.tipTelefonotlf = tipoTelefonotlf;
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
