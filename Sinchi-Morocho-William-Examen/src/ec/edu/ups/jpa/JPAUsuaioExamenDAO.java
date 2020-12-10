package ec.edu.ups.jpa;

import ec.edu.ups.dao.UsuarioExamenDAO;
import ec.edu.ups.entidades.UsuarioExamen;
public class JPAUsuaioExamenDAO extends JPAGenericDAO<UsuarioExamen, Integer> implements UsuarioExamenDAO{

	public JPAUsuaioExamenDAO() {
		super(UsuarioExamen.class);
	}

}
