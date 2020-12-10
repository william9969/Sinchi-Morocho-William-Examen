package ec.edu.ups.dao;

import ec.edu.ups.entidades.*;
import ec.edu.ups.jpa.JPADAOFactory;

public abstract class DAOFactory {

	protected static DAOFactory factory =new JPADAOFactory();

	public static DAOFactory getFactory() {
		return factory;
	}

	
	public abstract UsuarioExamenDAO getUsuarioExamenDAO();
	public abstract TelefonosExamenDAO getTelefonosExamenDAO();
	public abstract OperadoraExamenDAO getOperadoraExamenDAO();
	public abstract TipoTelfExamenDAO getTipoTelfExamenDAO();
}
