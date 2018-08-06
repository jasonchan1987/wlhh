package com.bootdo.su.service;

import com.bootdo.su.domain.MaterielDO;

import java.util.List;
import java.util.Map;

/**
 * 物料表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
public interface MaterielService {
	
	MaterielDO get(Long maid);
	
	List<MaterielDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(MaterielDO materiel);
	
	int update(MaterielDO materiel);
	
	int remove(Long maid);
	
	int batchRemove(Long[] maids);
}
