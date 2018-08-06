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

import com.bootdo.su.domain.StatehisDO;
import com.bootdo.su.service.StatehisService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 供应商状态变化历史记录表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
 
@Controller
@RequestMapping("/su/statehis")
public class StatehisController {
	@Autowired
	private StatehisService statehisService;
	
	@GetMapping()
	@RequiresPermissions("su:statehis:statehis")
	String Statehis(){
	    return "su/statehis/statehis";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("su:statehis:statehis")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<StatehisDO> statehisList = statehisService.list(query);
		int total = statehisService.count(query);
		PageUtils pageUtils = new PageUtils(statehisList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("su:statehis:add")
	String add(){
	    return "su/statehis/add";
	}

	@GetMapping("/edit/{shid}")
	@RequiresPermissions("su:statehis:edit")
	String edit(@PathVariable("shid") Long shid,Model model){
		StatehisDO statehis = statehisService.get(shid);
		model.addAttribute("statehis", statehis);
	    return "su/statehis/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("su:statehis:add")
	public R save( StatehisDO statehis){
		if(statehisService.save(statehis)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("su:statehis:edit")
	public R update( StatehisDO statehis){
		statehisService.update(statehis);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("su:statehis:remove")
	public R remove( Long shid){
		if(statehisService.remove(shid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("su:statehis:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] shids){
		statehisService.batchRemove(shids);
		return R.ok();
	}
	
}
