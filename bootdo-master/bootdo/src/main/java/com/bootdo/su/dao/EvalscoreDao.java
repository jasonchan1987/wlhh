package com.bootdo.su.dao;

import com.bootdo.su.domain.EvalscoreDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 供应商评分表
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
@Mapper
public interface EvalscoreDao {

	EvalscoreDO get(Long evid);
	
	List<EvalscoreDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(EvalscoreDO evalscore);
	
	int update(EvalscoreDO evalscore);
	
	int remove(Long evid);
	
	int batchRemove(Long[] evids);
}
