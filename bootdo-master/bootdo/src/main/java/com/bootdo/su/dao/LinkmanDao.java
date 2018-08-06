package com.bootdo.su.dao;

import com.bootdo.su.domain.LinkmanDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 联系人表
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
@Mapper
public interface LinkmanDao {

	LinkmanDO get(Long lmid);
	
	List<LinkmanDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(LinkmanDO linkman);
	
	int update(LinkmanDO linkman);
	
	int remove(Long lmid);
	
	int batchRemove(Long[] lmids);
}
