package com.bootdo.su.service;

import com.bootdo.su.domain.EvalgradeDO;

import java.util.List;
import java.util.Map;

/**
 * 供应商等级表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
public interface EvalgradeService {
	
	EvalgradeDO get(Long evgid);
	
	List<EvalgradeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(EvalgradeDO evalgrade);
	
	int update(EvalgradeDO evalgrade);
	
	int remove(Long evgid);
	
	int batchRemove(Long[] evgids);
}
