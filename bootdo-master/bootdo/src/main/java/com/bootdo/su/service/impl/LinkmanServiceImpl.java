package com.bootdo.su.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.su.dao.LinkmanDao;
import com.bootdo.su.domain.LinkmanDO;
import com.bootdo.su.service.LinkmanService;



@Service
public class LinkmanServiceImpl implements LinkmanService {
	@Autowired
	private LinkmanDao linkmanDao;
	
	@Override
	public LinkmanDO get(Long lmid){
		return linkmanDao.get(lmid);
	}
	
	@Override
	public List<LinkmanDO> list(Map<String, Object> map){
		return linkmanDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return linkmanDao.count(map);
	}
	
	@Override
	public int save(LinkmanDO linkman){
		return linkmanDao.save(linkman);
	}
	
	@Override
	public int update(LinkmanDO linkman){
		return linkmanDao.update(linkman);
	}
	
	@Override
	public int remove(Long lmid){
		return linkmanDao.remove(lmid);
	}
	
	@Override
	public int batchRemove(Long[] lmids){
		return linkmanDao.batchRemove(lmids);
	}
	
}
