package ec.edu.ups.jpa;
import ec.edu.ups.entidades.OperadoraExamen;


import java.util.List;

import ec.edu.ups.dao.OperadoraExamenDAO;
public class JPAOperadoraExamenDAO extends JPAGenericDAO<OperadoraExamen, Integer> implements OperadoraExamenDAO{

	public JPAOperadoraExamenDAO() {
		super(OperadoraExamen.class);
	}

	@Override
	public List<OperadoraExamen> listaOperadorasTel() {
		String queryFindRequerimiento="SELECT ot FROM OperadoraExamen ot";
		List<OperadoraExamen> list= em.createQuery(queryFindRequerimiento).getResultList();
		em.close();
		return list;
	}

	@Override
	public OperadoraExamen readByNombre(String nombre) {
		OperadoraExamen operadora =null;
		System.out.println(nombre+"Y su longitud es" + nombre.length());
		String queryFindOperadora="SELECT ex FROM OperadoraExamen ex WHERE ex.nomOperadora=:nom";
		try{
		 operadora = (OperadoraExamen) em.createQuery(queryFindOperadora).setParameter("nom",nombre).getSingleResult();
		System.out.println(operadora);
		em.close();
			}catch(Exception e) {
				System.out.println("Error al buscar lla operadora");
			}
		
		System.out.println(nombre);
		return operadora;
	}

}
