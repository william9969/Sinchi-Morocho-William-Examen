package ec.edu.ups.jpa;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.OperadoraExamenDAO;
import ec.edu.ups.dao.TelefonosExamenDAO;
import ec.edu.ups.dao.TipoTelfExamenDAO;
import ec.edu.ups.dao.UsuarioExamenDAO;
import ec.edu.ups.entidades.OperadoraExamen;
import ec.edu.ups.entidades.TelefonosExamen;
import ec.edu.ups.entidades.TipoTelfExamen;
import ec.edu.ups.entidades.UsuarioExamen;

public class JPADAOFactory extends DAOFactory{

	@Override
	public UsuarioExamenDAO getUsuarioExamenDAO() {
		// TODO Auto-generated method stub
		return new JPAUsuaioExamenDAO();
	}

	@Override
	public TelefonosExamenDAO getTelefonosExamenDAO() {
		// TODO Auto-generated method stub
		return new JPATelefonosExamenDAO();
	}

	@Override
	public OperadoraExamenDAO getOperadoraExamenDAO() {
		// TODO Auto-generated method stub
		return new JPAOperadoraExamenDAO();
	}

	@Override
	public TipoTelfExamenDAO getTipoTelfExamenDAO() {
		// TODO Auto-generated method stub
		return new JPATipoTelfExamenDAO();
	}



	

}
