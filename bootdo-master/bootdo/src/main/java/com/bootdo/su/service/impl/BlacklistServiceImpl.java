package com.bootdo.su.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.su.dao.BlacklistDao;
import com.bootdo.su.domain.BlacklistDO;
import com.bootdo.su.service.BlacklistService;



@Service
public class BlacklistServiceImpl implements BlacklistService {
	@Autowired
	private BlacklistDao blacklistDao;
	
	@Override
	public BlacklistDO get(Long blid){
		return blacklistDao.get(blid);
	}
	
	@Override
	public List<BlacklistDO> list(Map<String, Object> map){
		return blacklistDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return blacklistDao.count(map);
	}
	
	@Override
	public int save(BlacklistDO blacklist){
		return blacklistDao.save(blacklist);
	}
	
	@Override
	public int update(BlacklistDO blacklist){
		return blacklistDao.update(blacklist);
	}
	
	@Override
	public int remove(Long blid){
		return blacklistDao.remove(blid);
	}
	
	@Override
	public int batchRemove(Long[] blids){
		return blacklistDao.batchRemove(blids);
	}
	
}
