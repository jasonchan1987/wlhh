package com.bootdo.su.dao;

import com.bootdo.su.domain.ContractDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 合同表
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:34
 */
@Mapper
public interface ContractDao {

	ContractDO get(Long conid);
	
	List<ContractDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(ContractDO contract);
	
	int update(ContractDO contract);
	
	int remove(Long conid);
	
	int batchRemove(Long[] conids);
}
