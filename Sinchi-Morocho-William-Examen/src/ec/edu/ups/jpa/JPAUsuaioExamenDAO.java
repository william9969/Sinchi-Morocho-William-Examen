package ec.edu.ups.jpa;

import java.util.List;

import ec.edu.ups.dao.UsuarioExamenDAO;
import ec.edu.ups.entidades.UsuarioExamen;
public class JPAUsuaioExamenDAO extends JPAGenericDAO<UsuarioExamen, Integer> implements UsuarioExamenDAO{

	public JPAUsuaioExamenDAO() {
		super(UsuarioExamen.class);
	}

	@Override
	public List<UsuarioExamen> listadeUsuarios() {
		String queryFindAgenda="SELECT u FROM UsuarioExamen u";
		
		List<UsuarioExamen> agenda =  em.createQuery(queryFindAgenda).getResultList();;
		em.close();
		//System.out.println(categorias.get(1).getNomCatProd() + categorias.get(2).getNomCatProd() + categorias.get(3).getNomCatProd());
		return agenda;
	}

}
