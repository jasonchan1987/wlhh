package com.bootdo.su.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.su.dao.StatehisDao;
import com.bootdo.su.domain.StatehisDO;
import com.bootdo.su.service.StatehisService;



@Service
public class StatehisServiceImpl implements StatehisService {
	@Autowired
	private StatehisDao statehisDao;
	
	@Override
	public StatehisDO get(Long shid){
		return statehisDao.get(shid);
	}
	
	@Override
	public List<StatehisDO> list(Map<String, Object> map){
		return statehisDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return statehisDao.count(map);
	}
	
	@Override
	public int save(StatehisDO statehis){
		return statehisDao.save(statehis);
	}
	
	@Override
	public int update(StatehisDO statehis){
		return statehisDao.update(statehis);
	}
	
	@Override
	public int remove(Long shid){
		return statehisDao.remove(shid);
	}
	
	@Override
	public int batchRemove(Long[] shids){
		return statehisDao.batchRemove(shids);
	}
	
}
