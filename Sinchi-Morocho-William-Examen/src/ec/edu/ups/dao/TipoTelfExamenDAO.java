package ec.edu.ups.dao;
import java.util.List;

import ec.edu.ups.entidades.TipoTelfExamen;
public interface TipoTelfExamenDAO extends GenericDAO<TipoTelfExamen, Integer>{
	public abstract List<TipoTelfExamen> listaTiposTelefonos();
	public abstract TipoTelfExamen readByNombre(String nombre);
}
