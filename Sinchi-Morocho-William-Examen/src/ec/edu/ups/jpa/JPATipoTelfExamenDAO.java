package ec.edu.ups.jpa;
import ec.edu.ups.dao.TipoTelfExamenDAO;
import ec.edu.ups.entidades.TipoTelfExamen;
public class JPATipoTelfExamenDAO extends JPAGenericDAO<TipoTelfExamen, Integer> implements TipoTelfExamenDAO{

	public JPATipoTelfExamenDAO() {
		super(TipoTelfExamen.class);
	}

}
