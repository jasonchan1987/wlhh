package com.bootdo.su.dao;

import com.bootdo.su.domain.BlacklistDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 供应商黑名单历史记录表
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:34
 */
@Mapper
public interface BlacklistDao {

	BlacklistDO get(Long blid);
	
	List<BlacklistDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(BlacklistDO blacklist);
	
	int update(BlacklistDO blacklist);
	
	int remove(Long blid);
	
	int batchRemove(Long[] blids);
}
