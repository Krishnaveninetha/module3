package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.capg.beans.TDSMaster;

@Component("tdsDao")
@Repository
@ComponentScan("com")
public class TDSDaoImpl implements TDSDao{
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public TDSMaster getByTDSId(int id) {
		TDSMaster tdsBean = entityManager.find(TDSMaster.class, id);
		return tdsBean;
	}

}
