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

import com.bootdo.su.domain.EvalgradeDO;
import com.bootdo.su.service.EvalgradeService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 供应商等级表
 * 
 * @author yhj&cping
 * @email wlhh@163.com
 * @date 2018-08-02 08:07:35
 */
 
@Controller
@RequestMapping("/su/evalgrade")
public class EvalgradeController {
	@Autowired
	private EvalgradeService evalgradeService;
	
	@GetMapping()
	@RequiresPermissions("su:evalgrade:evalgrade")
	String Evalgrade(){
	    return "su/evalgrade/evalgrade";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("su:evalgrade:evalgrade")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<EvalgradeDO> evalgradeList = evalgradeService.list(query);
		int total = evalgradeService.count(query);
		PageUtils pageUtils = new PageUtils(evalgradeList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("su:evalgrade:add")
	String add(){
	    return "su/evalgrade/add";
	}

	@GetMapping("/edit/{evgid}")
	@RequiresPermissions("su:evalgrade:edit")
	String edit(@PathVariable("evgid") Long evgid,Model model){
		EvalgradeDO evalgrade = evalgradeService.get(evgid);
		model.addAttribute("evalgrade", evalgrade);
	    return "su/evalgrade/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("su:evalgrade:add")
	public R save( EvalgradeDO evalgrade){
		if(evalgradeService.save(evalgrade)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("su:evalgrade:edit")
	public R update( EvalgradeDO evalgrade){
		evalgradeService.update(evalgrade);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("su:evalgrade:remove")
	public R remove( Long evgid){
		if(evalgradeService.remove(evgid)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("su:evalgrade:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] evgids){
		evalgradeService.batchRemove(evgids);
		return R.ok();
	}
	
}
