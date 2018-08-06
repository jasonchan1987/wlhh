package com.bootdo.su.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.su.dao.SupplierDao;
import com.bootdo.su.domain.SupplierDO;
import com.bootdo.su.service.SupplierService;



@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDao supplierDao;
	
	@Override
	public SupplierDO get(Long srid){
		return supplierDao.get(srid);
	}
	
	@Override
	public List<SupplierDO> list(Map<String, Object> map){
		return supplierDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return supplierDao.count(map);
	}
	
	@Override
	public int save(SupplierDO supplier){
		return supplierDao.save(supplier);
	}
	
	@Override
	public int update(SupplierDO supplier){
		return supplierDao.update(supplier);
	}
	
	@Override
	public int remove(Long srid){
		return supplierDao.remove(srid);
	}
	
	@Override
	public int batchRemove(Long[] srids){
		return supplierDao.batchRemove(srids);
	}
	
}
