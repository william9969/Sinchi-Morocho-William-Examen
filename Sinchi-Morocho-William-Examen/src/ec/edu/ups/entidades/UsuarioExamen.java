package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: UsuarioExamen
 *
 */
@Entity

public class UsuarioExamen implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	
	private String cedUsuario;
	private String nomsUsuario;
	private String apeusuario;
	private String corrUsuario;
	private String contUsuario;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioTelExamen")
	private Set<TelefonosExamen> telefonos= new HashSet<TelefonosExamen>();
	
	public UsuarioExamen() {
		super();
	}
	
	

	public UsuarioExamen(String cedUsuario, String nomsUsuario, String apeusuario, String corrUsuario,
			String contUsuario) {
		super();
		this.cedUsuario = cedUsuario;
		this.nomsUsuario = nomsUsuario;
		this.apeusuario = apeusuario;
		this.corrUsuario = corrUsuario;
		this.contUsuario = contUsuario;
	}



	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCedUsuario() {
		return cedUsuario;
	}

	public void setCedUsuario(String cedUsuario) {
		this.cedUsuario = cedUsuario;
	}

	public String getNomsUsuario() {
		return nomsUsuario;
	}

	public void setNomsUsuario(String nomsUsuario) {
		this.nomsUsuario = nomsUsuario;
	}

	public String getApeusuario() {
		return apeusuario;
	}

	public void setApeusuario(String apeusuario) {
		this.apeusuario = apeusuario;
	}

	public String getCorrUsuario() {
		return corrUsuario;
	}

	public void setCorrUsuario(String corrUsuario) {
		this.corrUsuario = corrUsuario;
	}

	public String getContUsuario() {
		return contUsuario;
	}

	public void setContUsuario(String contUsuario) {
		this.contUsuario = contUsuario;
	}

	public Set<TelefonosExamen> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(Set<TelefonosExamen> telefonos) {
		this.telefonos = telefonos;
	}
	

	@Override
	public int hashCode() {
		return this.idUsuario;
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
