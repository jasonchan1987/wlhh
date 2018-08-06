package com.bootdo.su.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.su.dao.MaterielDao;
import com.bootdo.su.domain.MaterielDO;
import com.bootdo.su.service.MaterielService;



@Service
public class MaterielServiceImpl implements MaterielService {
	@Autowired
	private MaterielDao materielDao;
	
	@Override
	public MaterielDO get(Long maid){
		return materielDao.get(maid);
	}
	
	@Override
	public List<MaterielDO> list(Map<String, Object> map){
		return materielDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return materielDao.count(map);
	}
	
	@Override
	public int save(MaterielDO materiel){
		return materielDao.save(materiel);
	}
	
	@Override
	public int update(MaterielDO materiel){
		return materielDao.update(materiel);
	}
	
	@Override
	public int remove(Long maid){
		return materielDao.remove(maid);
	}
	
	@Override
	public int batchRemove(Long[] maids){
		return materielDao.batchRemove(maids);
	}
	
}
