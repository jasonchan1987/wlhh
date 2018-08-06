package com.bootdo.su.dao;

import com.bootdo.su.domain.EvalgradeDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 供应商等级表
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
@Mapper
public interface EvalgradeDao {

	EvalgradeDO get(Long evgid);
	
	List<EvalgradeDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(EvalgradeDO evalgrade);
	
	int update(EvalgradeDO evalgrade);
	
	int remove(Long evgid);
	
	int batchRemove(Long[] evgids);
}
