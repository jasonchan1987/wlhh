package com.bootdo.su.service;

import com.bootdo.su.domain.EvalscoreDO;

import java.util.List;
import java.util.Map;

/**
 * 供应商评分表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
public interface EvalscoreService {
	
	EvalscoreDO get(Long evid);
	
	List<EvalscoreDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(EvalscoreDO evalscore);
	
	int update(EvalscoreDO evalscore);
	
	int remove(Long evid);
	
	int batchRemove(Long[] evids);
}
