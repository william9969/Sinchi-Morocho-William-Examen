package ec.edu.ups.dao;

import ec.edu.ups.entidades.TelefonosExamen;
import ec.edu.ups.entidades.UsuarioExamen;
import ec.edu.ups.jpa.JPADAOFactory;

public abstract class DAOFactory {

	protected static DAOFactory factory =new JPADAOFactory();

	public static DAOFactory getFactory() {
		return factory;
	}

	
	public abstract UsuarioExamen getUsuarioExamen();
	public abstract TelefonosExamen getTelefonosExamen();
}
