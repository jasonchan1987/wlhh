package com.bootdo.su.dao;

import com.bootdo.su.domain.StatehisDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 供应商状态变化历史记录表
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
@Mapper
public interface StatehisDao {

	StatehisDO get(Long shid);
	
	List<StatehisDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(StatehisDO statehis);
	
	int update(StatehisDO statehis);
	
	int remove(Long shid);
	
	int batchRemove(Long[] shids);
}
