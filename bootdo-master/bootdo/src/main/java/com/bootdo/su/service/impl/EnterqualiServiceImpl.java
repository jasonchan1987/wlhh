package com.bootdo.su.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.su.dao.EnterqualiDao;
import com.bootdo.su.domain.EnterqualiDO;
import com.bootdo.su.service.EnterqualiService;



@Service
public class EnterqualiServiceImpl implements EnterqualiService {
	@Autowired
	private EnterqualiDao enterqualiDao;
	
	@Override
	public EnterqualiDO get(Long eqid){
		return enterqualiDao.get(eqid);
	}
	
	@Override
	public List<EnterqualiDO> list(Map<String, Object> map){
		return enterqualiDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return enterqualiDao.count(map);
	}
	
	@Override
	public int save(EnterqualiDO enterquali){
		return enterqualiDao.save(enterquali);
	}
	
	@Override
	public int update(EnterqualiDO enterquali){
		return enterqualiDao.update(enterquali);
	}
	
	@Override
	public int remove(Long eqid){
		return enterqualiDao.remove(eqid);
	}
	
	@Override
	public int batchRemove(Long[] eqids){
		return enterqualiDao.batchRemove(eqids);
	}
	
}
