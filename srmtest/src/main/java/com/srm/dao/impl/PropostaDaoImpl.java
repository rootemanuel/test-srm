package com.srm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.srm.dao.PropostaDao;
import com.srm.entity.PropostaEntity;

@Repository
public class PropostaDaoImpl implements PropostaDao {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void insereProposta(PropostaEntity proposta) {
		em.persist(proposta);
		em.flush();
		em.clear();
	}
}
