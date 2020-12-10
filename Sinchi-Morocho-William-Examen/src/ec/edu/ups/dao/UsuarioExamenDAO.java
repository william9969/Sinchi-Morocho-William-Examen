package ec.edu.ups.dao;
import java.util.List;

import ec.edu.ups.entidades.UsuarioExamen;
public interface UsuarioExamenDAO extends GenericDAO<UsuarioExamen,Integer> {
	public abstract List<UsuarioExamen> listadeUsuarios();
}
