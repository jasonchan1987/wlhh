package com.bootdo.su.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.su.dao.EvalscoreDao;
import com.bootdo.su.domain.EvalscoreDO;
import com.bootdo.su.service.EvalscoreService;



@Service
public class EvalscoreServiceImpl implements EvalscoreService {
	@Autowired
	private EvalscoreDao evalscoreDao;
	
	@Override
	public EvalscoreDO get(Long evid){
		return evalscoreDao.get(evid);
	}
	
	@Override
	public List<EvalscoreDO> list(Map<String, Object> map){
		return evalscoreDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return evalscoreDao.count(map);
	}
	
	@Override
	public int save(EvalscoreDO evalscore){
		return evalscoreDao.save(evalscore);
	}
	
	@Override
	public int update(EvalscoreDO evalscore){
		return evalscoreDao.update(evalscore);
	}
	
	@Override
	public int remove(Long evid){
		return evalscoreDao.remove(evid);
	}
	
	@Override
	public int batchRemove(Long[] evids){
		return evalscoreDao.batchRemove(evids);
	}
	
}
