package ec.edu.ups.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import ec.edu.ups.dao.GenericDAO;

public class JPAGenericDAO<T,ID> implements GenericDAO<T, ID> {

	private Class<T> persistentClass;
	protected EntityManager em;
		
	public JPAGenericDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
		em = Persistence.createEntityManagerFactory("Examen").createEntityManager();
	}

	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
		    em.persist(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO: create " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public T read(ID id) {
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		em.getTransaction().begin();
		try {
		    em.merge(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public void delete(T entity) {
		em.getTransaction().begin();
		try {
		    em.remove(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public void deleteByID(ID id) {
		T entity = this.read(id);
		if (entity != null)
		    this.delete(entity);
		
	}

	@Override
	public List<T> find() {
		// TODO Auto-generated method stub
		return null;
	}

}
