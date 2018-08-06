package com.bootdo.su.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.su.domain.MaterielDO;
import com.bootdo.su.service.MaterielService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 物料表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
 
@Controller
@RequestMapping("/su/materiel")
public class MaterielController {
	@Autowired
	private MaterielService materielService;
	
	@GetMapping()
	@RequiresPermissions("su:materiel:materiel")
	String Materiel(){
	    return "su/materiel/materiel";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("su:materiel:materiel")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<MaterielDO> materielList = materielService.list(query);
		int total = materielService.count(query);
		PageUtils pageUtils = new PageUtils(materielList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("su:materiel:add")
	String add(){
	    return "su/materiel/add";
	}

	@GetMapping("/edit/{maid}")
	@RequiresPermissions("su:materiel:edit")
	String edit(@PathVariable("maid") Long maid,Model model){
		MaterielDO materiel = materielService.get(maid);
		model.addAttribute("materiel", materiel);
	    return "su/materiel/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("su:materiel:add")
	public R save( MaterielDO materiel){
		if(materielService.save(materiel)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("su:materiel:edit")
	public R update( MaterielDO materiel){
		materielService.update(materiel);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("su:materiel:remove")
	public R remove( Long maid){
		if(materielService.remove(maid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("su:materiel:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] maids){
		materielService.batchRemove(maids);
		return R.ok();
	}
	
}
