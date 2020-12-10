package ec.edu.ups.dao;
import java.util.List;

import ec.edu.ups.entidades.OperadoraExamen;
public interface OperadoraExamenDAO extends GenericDAO<OperadoraExamen, Integer>{
	public abstract List<OperadoraExamen> listaOperadorasTel();
	public abstract OperadoraExamen readByNombre(String nombre);
	
}
