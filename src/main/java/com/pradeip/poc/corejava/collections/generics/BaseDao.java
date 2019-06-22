package com.pradeip.poc.corejava.collections.generics;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;



/**
 * 
 * @author pradeep_patel
 *
 * @param <PK>
 * @param <T>
 *            Performs Generic CRUD that do not need specialized handling. All
 *            Dao should extend this class and at the same time implement
 *            Interfaces
 *            Generic are being used here 
 */
public abstract class BaseDao<PK extends Serializable, T> {

	public final Class<T> persistentClass;

	@SuppressWarnings("unchecked")
	public BaseDao() {
		this.persistentClass = (Class<T>) ((ParameterizedType) this.getClass()
				.getGenericSuperclass()).getActualTypeArguments()[1];
	}

	//@Autowired
	//private SessionFactory sessionFactory;

	/*public Session getSession() throws Exception {
		try {
			return sessionFactory.getCurrentSession();
		} catch (Exception e) {
			throw e;
		}

	}*/

	@SuppressWarnings("unchecked")
	public T getByKey(PK key) throws Exception {
		return null; //(T) getSession().get(persistentClass, key);
	}

	public void persist(T entity) throws Exception {
		//getSession().persist(entity);

	}

	public void update(T entity) throws Exception {
		//getSession().update(entity);

	}

	public void delete(T entity) throws Exception {
		//getSession().delete(entity);
	}

	/*protected Criteria createEntityCriteria() throws Exception {
		return null; //getSession().createCriteria(persistentClass);
	}*/

}
