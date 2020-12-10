package ec.edu.ups.jpa;
import java.util.List;

import ec.edu.ups.dao.TipoTelfExamenDAO;
import ec.edu.ups.entidades.OperadoraExamen;
import ec.edu.ups.entidades.TipoTelfExamen;
public class JPATipoTelfExamenDAO extends JPAGenericDAO<TipoTelfExamen, Integer> implements TipoTelfExamenDAO{

	public JPATipoTelfExamenDAO() {
		super(TipoTelfExamen.class);
	}

	@Override
	public List<TipoTelfExamen> listaTiposTelefonos() {
		String queryFindRequerimiento="SELECT tf FROM TipoTelfExamen tf";
		List<TipoTelfExamen> list= em.createQuery(queryFindRequerimiento).getResultList();

		em.close();
		
		
		return list;
	}

	@Override
	public TipoTelfExamen readByNombre(String nombre) {
		TipoTelfExamen tipoT=null;
		System.out.println(nombre+"Y su longitud es" + nombre.length());
		String queryFindTipo="SELECT t FROM TipoTelfExamen t WHERE t.tipoTelefono=:nom";
		try {
		 tipoT = (TipoTelfExamen) em.createQuery(queryFindTipo).setParameter("nom",nombre).getSingleResult();
		System.out.println(tipoT);
		em.close();
		}catch(Exception e) {
			System.out.println("Error al buscar el tipo");
		}
		System.out.println(nombre);
		return tipoT;
				
		
	}

}
