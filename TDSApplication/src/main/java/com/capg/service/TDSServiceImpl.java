package com.capg.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.capg.beans.TDSMaster;
import com.capg.dao.TDSDao;

@Component("tdsService")
@Service//to indicate service class
@Transactional
public class TDSServiceImpl implements TDSService{

	@Autowired
	TDSDao tdsDao;
	@Override
	public TDSMaster getByTDSId(int id) {
		
		return tdsDao.getByTDSId(id);
	}

}
