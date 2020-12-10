package ec.edu.ups.jpa;
import ec.edu.ups.entidades.OperadoraExamen;
import ec.edu.ups.dao.OperadoraExamenDAO;
public class JPAOperadoraExamenDAO extends JPAGenericDAO<OperadoraExamen, Integer> implements OperadoraExamenDAO{

	public JPAOperadoraExamenDAO() {
		super(OperadoraExamen.class);
	}

}
