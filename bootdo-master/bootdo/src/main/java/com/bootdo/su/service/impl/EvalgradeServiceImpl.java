package com.bootdo.su.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.su.dao.EvalgradeDao;
import com.bootdo.su.domain.EvalgradeDO;
import com.bootdo.su.service.EvalgradeService;



@Service
public class EvalgradeServiceImpl implements EvalgradeService {
	@Autowired
	private EvalgradeDao evalgradeDao;
	
	@Override
	public EvalgradeDO get(Long evgid){
		return evalgradeDao.get(evgid);
	}
	
	@Override
	public List<EvalgradeDO> list(Map<String, Object> map){
		return evalgradeDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return evalgradeDao.count(map);
	}
	
	@Override
	public int save(EvalgradeDO evalgrade){
		return evalgradeDao.save(evalgrade);
	}
	
	@Override
	public int update(EvalgradeDO evalgrade){
		return evalgradeDao.update(evalgrade);
	}
	
	@Override
	public int remove(Long evgid){
		return evalgradeDao.remove(evgid);
	}
	
	@Override
	public int batchRemove(Long[] evgids){
		return evalgradeDao.batchRemove(evgids);
	}
	
}
