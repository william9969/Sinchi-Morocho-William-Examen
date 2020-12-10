package ec.edu.ups.jpa;

import ec.edu.ups.entidades.TelefonosExamen;
import ec.edu.ups.dao.TelefonosExamenDAO;
public class JPATelefonosExamenDAO extends JPAGenericDAO<TelefonosExamen, Integer> implements TelefonosExamenDAO{

	public JPATelefonosExamenDAO() {
		super(TelefonosExamen.class);
	}

}
