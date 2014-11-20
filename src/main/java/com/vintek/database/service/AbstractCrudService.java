package com.vintek.database.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

public abstract class AbstractCrudService {	
	abstract EntityManager getEm();

	public <T> T create(T t) {
		this.getEm().persist(t);
		this.getEm().flush();
		this.getEm().refresh(t);
		return t;
	}

	public <T> T find(Class<T> type, Object id) {
		return (T) this.getEm().find(type, id);
	}

	public void delete(Class type, Object id) {
		Object ref = this.getEm().getReference(type, id);
		this.getEm().remove(ref);
	}

	public <T> T update(T t) {
		return (T) this.getEm().merge(t);
	}
	
	public <T> List<T> findWithNamedQuery(String namedQueryName) {
		return this.getEm().createNamedQuery(namedQueryName).getResultList();
	}

	public <T> List<T> findWithNamedQuery(String namedQueryName, Map<String, Object> parameters) {
		return findWithNamedQuery(namedQueryName, parameters, 0);
	}

//	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public <T> List<T> findWithNamedQuery(String namedQueryName, String... parameters) {
		Query query = getEm().createNamedQuery(namedQueryName);
		int paramPos = 1;
		for (String p : parameters) {
			query.setParameter(paramPos++, p);
		}
//		query.setHint("org.hibernate.readOnly", "true");
		return query.getResultList();
	}	

	public <T> T findWithNamedQuerySingleResult(String namedQueryName, String... parameters) throws NonUniqueResultException, EntityNotFoundException, NoResultException {		
		Query query = getEm().createNamedQuery(namedQueryName);
		int paramPos = 1;
		for (String p : parameters) {
			query.setParameter(paramPos++, p);
		}			
		return (T) query.getSingleResult();
	}
	
	public <T> List<T> findWithNamedQuery(String queryName, int resultLimit) {
		return this.getEm().createNamedQuery(queryName).setMaxResults(resultLimit).getResultList();
	}

	public <T> List<T> findByNativeQuery(String sql, Class<T> type) {
		return this.getEm().createNativeQuery(sql, type).getResultList();
	}

	public <T> List<T> findWithNamedQuery(String namedQueryName, Map<String, Object> parameters, int resultLimit) {
		Set<Entry<String, Object>> rawParameters = parameters.entrySet();
		Query query = this.getEm().createNamedQuery(namedQueryName);
		if (resultLimit > 0)
			query.setMaxResults(resultLimit);
		for (Entry<String, Object> entry : rawParameters) {
			query.setParameter(entry.getKey(), entry.getValue());
		}
		return query.getResultList();
	}

	public <T> List<T> findWithCriteria(CriteriaQuery<T> criteria) {
		return getEm().createQuery(criteria).getResultList();
	}

	public <T> List<T> findWithCriteria(CriteriaQuery<T> criteria, int resultLimit) {
		Query query = this.getEm().createQuery(criteria);
		query.setMaxResults(resultLimit);
		return query.getResultList();
	}
}
