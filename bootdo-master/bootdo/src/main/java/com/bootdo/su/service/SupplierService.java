package com.bootdo.su.service;

import com.bootdo.su.domain.SupplierDO;

import java.util.List;
import java.util.Map;

/**
 * 供应商表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
public interface SupplierService {
	
	SupplierDO get(Long srid);
	
	List<SupplierDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(SupplierDO supplier);
	
	int update(SupplierDO supplier);
	
	int remove(Long srid);
	
	int batchRemove(Long[] srids);
}
