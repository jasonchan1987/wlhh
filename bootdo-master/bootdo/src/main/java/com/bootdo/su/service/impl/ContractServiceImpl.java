package com.bootdo.su.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.su.dao.ContractDao;
import com.bootdo.su.domain.ContractDO;
import com.bootdo.su.service.ContractService;



@Service
public class ContractServiceImpl implements ContractService {
	@Autowired
	private ContractDao contractDao;
	
	@Override
	public ContractDO get(Long conid){
		return contractDao.get(conid);
	}
	
	@Override
	public List<ContractDO> list(Map<String, Object> map){
		return contractDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return contractDao.count(map);
	}
	
	@Override
	public int save(ContractDO contract){
		return contractDao.save(contract);
	}
	
	@Override
	public int update(ContractDO contract){
		return contractDao.update(contract);
	}
	
	@Override
	public int remove(Long conid){
		return contractDao.remove(conid);
	}
	
	@Override
	public int batchRemove(Long[] conids){
		return contractDao.batchRemove(conids);
	}
	
}
