package com.bootdo.su.dao;

import com.bootdo.su.domain.SupplierDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 供应商表
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
@Mapper
public interface SupplierDao {

	SupplierDO get(Long srid);
	
	List<SupplierDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(SupplierDO supplier);
	
	int update(SupplierDO supplier);
	
	int remove(Long srid);
	
	int batchRemove(Long[] srids);
}
