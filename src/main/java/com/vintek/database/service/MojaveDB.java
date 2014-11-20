package com.vintek.database.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
//@TransactionAttribute(TransactionAttributeType.MANDATORY)
public class MojaveDB extends AbstractCrudService {

	@PersistenceContext(unitName="MojavePU")
	EntityManager em;

	@Override
	EntityManager getEm() {
		return em;
	}
}
