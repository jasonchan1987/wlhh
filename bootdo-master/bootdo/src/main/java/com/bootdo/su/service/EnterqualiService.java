package com.bootdo.su.service;

import com.bootdo.su.domain.EnterqualiDO;

import java.util.List;
import java.util.Map;

/**
 * 资质表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:34
 */
public interface EnterqualiService {
	
	EnterqualiDO get(Long eqid);
	
	List<EnterqualiDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(EnterqualiDO enterquali);
	
	int update(EnterqualiDO enterquali);
	
	int remove(Long eqid);
	
	int batchRemove(Long[] eqids);
}
